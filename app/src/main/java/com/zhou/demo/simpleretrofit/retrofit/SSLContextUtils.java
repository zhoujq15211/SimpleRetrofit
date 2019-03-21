package com.zhou.demo.simpleretrofit.retrofit;

import java.security.SecureRandom;
import java.security.cert.X509Certificate;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

import okhttp3.OkHttpClient;

/**
 * @des:
 * @Created  by:zhoujq on  2019/3/21 14:38
 * @Modifyed by:zhoujq on  2019/3/21 14:38
 */

public class SSLContextUtils {
    public static void setSSLContext(OkHttpClient.Builder builder, SSLContext sslContext) {
        if (sslContext == null) {
            //全信任
            try {
                X509TrustManager x509TrustManager = getX509TrustManager();
                SSLContext sc = SSLContext.getInstance("TLS");
                sc.init(null, new TrustManager[]{x509TrustManager}, new SecureRandom());
                builder.sslSocketFactory(sc.getSocketFactory());
                builder.hostnameVerifier(new HostnameVerifier() {
                    @Override
                    public boolean verify(String hostname, SSLSession session) {
                        return true;
                    }
                });
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            builder.sslSocketFactory(sslContext.getSocketFactory());
            builder.hostnameVerifier(new HostnameVerifier() {
                @Override
                public boolean verify(String s, SSLSession sslSession) {
                    return true;
                }
            });
        }
    }

    private static X509TrustManager getX509TrustManager() {
        return new X509TrustManager() {
            @Override
            public void checkClientTrusted(X509Certificate[] x509Certificates, String s) {

            }

            @Override
            public void checkServerTrusted(X509Certificate[] x509Certificates, String s) {

            }

            @Override
            public X509Certificate[] getAcceptedIssuers() {
                return new X509Certificate[0];
            }
        };
    }
}
