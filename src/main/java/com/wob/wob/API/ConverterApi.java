package com.wob.wob.API;

import com.wob.wob.model.ConverterModel;

import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Query;

public interface ConverterApi {
    @GET("/fetch/")
    public void convertVideo(@Query("format") String format,@Query("video") String video, Callback<ConverterModel> response);
}

