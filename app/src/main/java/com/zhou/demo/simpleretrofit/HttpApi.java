package com.zhou.demo.simpleretrofit;

import android.content.Context;
import android.support.annotation.NonNull;
import android.util.Log;

import com.google.gson.Gson;
import com.orhanobut.logger.Logger;
import com.zhou.demo.simpleretrofit.entity.Movie;
import com.zhou.demo.simpleretrofit.retrofit.RetrofitFactory;
import com.zhou.demo.simpleretrofit.service.TestService;
import com.zhou.demo.simpleretrofit.service.TestService2;

import java.util.Map;

import okhttp3.MediaType;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class HttpApi {
    private TestService testService;
    private TestService2 testService2;
    private Gson gson = new Gson();

    public HttpApi(Context context) {
        RetrofitFactory.instance().init(context.getApplicationContext(), "http://api.douban.com", true);
        testService = RetrofitFactory.instance().createService(TestService.class);
        testService2 = RetrofitFactory.instance().createService(TestService2.class);
    }

    public Call<Movie> getMovies(Map<String, Object> params) {
        Call<Movie> call = testService.getMovies(params);
        call.enqueue(new Callback<Movie>() {
            @Override
            public void onResponse(Call<Movie> call, Response<Movie> response) {
                Log.i("test", "onResponse:" + response.body());
            }

            @Override
            public void onFailure(Call<Movie> call, Throwable t) {
                Log.i("test", "onFailure:" + t);
            }
        });
        return call;
    }

    @NonNull
    private RequestBody getRequestBody(Map<String, Object> params) {
        return RequestBody.create(MediaType.parse("application/json; charset=utf-8"), gson.toJson(params));
    }

    //    public Call<HttpResponse<User>> getUser(String authorization, HttpFormatCallback<User> callback) {
//        Call<HttpResponse<User>> call = testService.getUser(authorization);
//        call.enqueue(callback);
//        return call;
//    }
//
//    public Call<HttpResponse<List<Device>>> getDeviceList(String authorization, Map<String, Object> params, HttpFormatCallback<List<Device>> callback) {
//        Call<HttpResponse<List<Device>>> call = testService2.getDeviceList(authorization, getRequestBody(params));
//        call.enqueue(callback);
//        return call;
//    }
}
