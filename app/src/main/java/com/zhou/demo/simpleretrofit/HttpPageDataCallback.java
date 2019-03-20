package com.zhou.demo.simpleretrofit;

import android.support.annotation.NonNull;

import com.zhou.demo.simpleretrofit.entity.HttpResponse;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * @Author: we
 * @Date: 2018/5/24
 * @Desc: 分页加载数据格式化回调
 */

public abstract class HttpPageDataCallback<T> implements Callback<HttpResponse<T>> {
    private List<T> responseData = new ArrayList<>();

    /**
     * http数据格式化回调
     *
     * @param call 请求的call
     * @param data 格式化后的数据
     */
    public abstract void onSuccess(Call<HttpResponse<T>> call, T data);

    /**
     * http 请求报错回调
     *
     * @param call  请求的call
     * @param code  错误码
     * @param error 错误描述
     */
    public abstract void onFailure(Call<HttpResponse<T>> call, int code, String error);

    @Override
    public void onFailure(@NonNull Call<HttpResponse<T>> call, Throwable t) {
        onFailure(call, -1, t.toString());
    }

    @Override
    public void onResponse(@NonNull Call<HttpResponse<T>> call, @NonNull Response<HttpResponse<T>> response) {
        onFormatData(call, response);
    }

    public void onFormatData(Call<HttpResponse<T>> action, Response<HttpResponse<T>> data) {
        if (data.isSuccessful() && data.body() != null) {
            if (data.body().getStatus() == 0) {
                onSuccess(action, data.body().getData());
            } else {
                onFailure(action, data.body().getStatus(), data.body().getMessage());
            }
        } else {
            onFailure(action, data.code(), data.message());
        }
    }
}
