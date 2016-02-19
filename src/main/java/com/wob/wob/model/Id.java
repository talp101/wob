package com.wob.wob.model;

import com.google.gson.annotations.Expose;

/**
 * Created by Tal on 18/06/2015.
 */
public class Id {

    @Expose
    private String kind;
    @Expose
    private String videoId;

    /**
     *
     * @return
     * The kind
     */
    public String getKind() {
        return kind;
    }

    /**
     *
     * @param kind
     * The kind
     */
    public void setKind(String kind) {
        this.kind = kind;
    }

    /**
     *
     * @return
     * The videoId
     */
    public String getVideoId() {
        return videoId;
    }

    /**
     *
     * @param videoId
     * The videoId
     */
    public void setVideoId(String videoId) {
        this.videoId = videoId;
    }

}
