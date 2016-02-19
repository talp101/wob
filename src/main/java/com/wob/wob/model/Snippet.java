package com.wob.wob.model;

import com.google.gson.annotations.Expose;

/**
 * Created by Tal on 18/06/2015.
 */
public class Snippet {

    @Expose
    private String publishedAt;
    @Expose
    private String channelId;
    @Expose
    private String title;
    @Expose
    private String description;
    @Expose
    private Thumbnails thumbnails;
    @Expose
    private String channelTitle;
    @Expose
    private String liveBroadcastContent;

    /**
     *
     * @return
     * The publishedAt
     */
    public String getPublishedAt() {
        return publishedAt;
    }

    /**
     *
     * @param publishedAt
     * The publishedAt
     */
    public void setPublishedAt(String publishedAt) {
        this.publishedAt = publishedAt;
    }

    /**
     *
     * @return
     * The channelId
     */
    public String getChannelId() {
        return channelId;
    }

    /**
     *
     * @param channelId
     * The channelId
     */
    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }

    /**
     *
     * @return
     * The title
     */
    public String getTitle() {
        return title;
    }

    /**
     *
     * @param title
     * The title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     *
     * @return
     * The description
     */
    public String getDescription() {
        return description;
    }

    /**
     *
     * @param description
     * The description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     *
     * @return
     * The thumbnails
     */
    public Thumbnails getThumbnails() {
        return thumbnails;
    }

    /**
     *
     * @param thumbnails
     * The thumbnails
     */
    public void setThumbnails(Thumbnails thumbnails) {
        this.thumbnails = thumbnails;
    }

    /**
     *
     * @return
     * The channelTitle
     */
    public String getChannelTitle() {
        return channelTitle;
    }

    /**
     *
     * @param channelTitle
     * The channelTitle
     */
    public void setChannelTitle(String channelTitle) {
        this.channelTitle = channelTitle;
    }

    /**
     *
     * @return
     * The liveBroadcastContent
     */
    public String getLiveBroadcastContent() {
        return liveBroadcastContent;
    }

    /**
     *
     * @param liveBroadcastContent
     * The liveBroadcastContent
     */
    public void setLiveBroadcastContent(String liveBroadcastContent) {
        this.liveBroadcastContent = liveBroadcastContent;
    }

}