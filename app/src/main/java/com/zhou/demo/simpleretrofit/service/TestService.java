package com.zhou.demo.simpleretrofit.service;

import com.zhou.demo.simpleretrofit.entity.Movie;

import java.util.Map;

import retrofit2.Call;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.QueryMap;

public interface TestService {
    @GET("/v2/movie/top250?")
    Call<Movie> getMovies(@QueryMap Map<String,Object> map);
}
