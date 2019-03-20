package com.zhou.demo.simpleretrofit.service;

import com.zhou.demo.simpleretrofit.entity.Movie;

import java.util.Map;

import retrofit2.Call;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.QueryMap;

public interface TestService2 {
    @GET("/v2/movie/top250?")
    Call<Movie> getMovies(@QueryMap Map<String, Object> map);
//    @POST("/appLogin/login")
//    Call<HttpResponse<HttpToken>> login(@Body RequestBody request);

//    @POST("/account/currentInfo")
//    Call<HttpResponse<User>> getUser(@Header("Authorization") String authorization);
//
//
//    @POST("/puppy-device/findMyDevices")
//    Call<HttpResponse<List<Device>>> getDeviceList(@Header("Authorization") String authorization, @Body RequestBody request);
}
