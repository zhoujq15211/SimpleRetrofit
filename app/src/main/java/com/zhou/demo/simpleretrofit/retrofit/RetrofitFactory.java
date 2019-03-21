package com.zhou.demo.simpleretrofit.retrofit;

import android.content.Context;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.util.Log;

import com.orhanobut.logger.AndroidLogAdapter;
import com.orhanobut.logger.FormatStrategy;
import com.orhanobut.logger.Logger;
import com.orhanobut.logger.PrettyFormatStrategy;

import java.io.File;
import java.util.concurrent.TimeUnit;

import javax.net.ssl.SSLContext;

import okhttp3.Cache;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * @des:二次封装Retrofit，使用okhttp、gson
 * @Created by:zhoujq on  2019/3/20 17:11
 * @Modifyed by:zhoujq on  2019/3/20 17:11
 */
public class RetrofitFactory {
    /**
     * 默认的超时时间
     */
    private final int defaultTimeoutSeconds = 20;
    private final int cacheSize = 10 * 1024 * 1024;
    private static RetrofitFactory sManager;
    private Retrofit retrofit;

    public static RetrofitFactory instance() {
        if (sManager == null) {
            synchronized (RetrofitFactory.class) {
                if (sManager == null) {
                    sManager = new RetrofitFactory();
                }
            }
        }
        return sManager;
    }

    public void release() {
        retrofit = null;
    }

    public void init(Context context, String baseUrl, boolean openLog) {
        init(context, baseUrl, null, openLog);
    }

    public void init(Context context, String baseUrl, SSLContext sslContext, final boolean openLog) {
        FormatStrategy formatStrategy = PrettyFormatStrategy.newBuilder()
                //（可选）是否显示线程信息。 默认值为true
//                .showThreadInfo(false)
                // （可选）要显示的方法行数。 默认2
                .methodCount(3)
                // （可选）设置调用堆栈的函数偏移值，0的话则从打印该Log的函数开始输出堆栈信息，默认是0
                .methodOffset(1)
                //（可选）每个日志的全局标记。 默认PRETTY_LOGGER（如上图）
                .tag("Topband").build();
        Logger.addLogAdapter(new AndroidLogAdapter(formatStrategy) {
            @Override
            public boolean isLoggable(int priority, @Nullable String tag) {
                return openLog;
            }
        });
        HttpLoggingInterceptor logInterceptor = new HttpLoggingInterceptor(new HttpLoggingInterceptor.Logger() {
            @Override
            public void log(String message) {
                Log.i("OkHttp", message);
            }
        });
        logInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        builder.addInterceptor(logInterceptor)
                .connectTimeout(defaultTimeoutSeconds, TimeUnit.SECONDS)
                .writeTimeout(defaultTimeoutSeconds, TimeUnit.SECONDS)
                .readTimeout(defaultTimeoutSeconds, TimeUnit.SECONDS)
                .retryOnConnectionFailure(true);
        if (context.getExternalCacheDir() != null) {
            String cacheDir = context.getExternalCacheDir().getAbsolutePath();
            Cache cache = getCache(cacheDir);
            //配置缓存
            builder.cache(cache);
        }
        SSLContextUtils.setSSLContext(builder, sslContext);
        retrofit = new Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .client(builder.build())
                .build();
    }

    private Cache getCache(String dirPath) {
        if (TextUtils.isEmpty(dirPath)) {
            return null;
        }
        File cacheDirectory = new File(dirPath);
        if (!cacheDirectory.exists()) {
            cacheDirectory.mkdirs();
        }
        return new Cache(cacheDirectory, cacheSize);
    }

    public <T> T createService(final Class<T> service) {
        if (retrofit == null) {
            throw new IllegalArgumentException("RetrofitFactory must call init() first!");
        }
        return retrofit.create(service);
    }

}
