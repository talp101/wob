package com.wob.wob.API;

import com.wob.wob.model.GitModel;
import com.wob.wob.model.YoutubeModel;

import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Path;
import retrofit.http.Query;

/**
 * Created by Tal on 18/06/2015.
 */
public interface YoutubeApi {
    @GET("/youtube/v3/search")
    public void searchVideo(@Query("part")String part,@Query("q") String q,@Query("key") String key,Callback<YoutubeModel> response);
}
