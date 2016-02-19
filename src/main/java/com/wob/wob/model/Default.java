package com.wob.wob.model;

import com.google.gson.annotations.Expose;

/**
 * Created by Tal on 18/06/2015.
 */
public class Default {
    @Expose
    private String url;

    /**
     *
     * @return
     * The url
     */
    public String getUrl() {
        return url;
    }

    /**
     *
     * @param url
     * The url
     */
    public void setUrl(String url) {
        this.url = url;
    }

}
