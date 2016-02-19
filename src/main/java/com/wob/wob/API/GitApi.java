package com.wob.wob.API;

import com.wob.wob.model.GitModel;

import java.util.concurrent.Callable;

import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Path;

/**
 * Created by Tal on 08/06/2015.
 */
public interface GitApi {
    @GET("/users/{user}")
    public void getFeed(@Path("user")String user, Callback<GitModel> response);
}
