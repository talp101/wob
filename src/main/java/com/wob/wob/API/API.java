package com.wob.wob.API;

import retrofit.RestAdapter;

public enum API {
    INSTANCE;

    private final String URL = "http://youtubeinmp3.com";
    private final RestAdapter restAdapter;
    private final ConverterApi api;

    API() {
        restAdapter = new RestAdapter.Builder().setEndpoint(URL).build();
        api = restAdapter.create(ConverterApi.class);
    }

    public static API getInstance(){
        return INSTANCE;
    }

    public ConverterApi getApi(){
        return api;
    }
}