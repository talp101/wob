package com.wob.wob.model;

import com.google.gson.annotations.Expose;


public class ConverterModel {

    @Expose
    private String title;
    @Expose
    private String length;
    @Expose
    private String link;

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
     * The length
     */
    public String getLength() {
        return length;
    }

    /**
     *
     * @param length
     * The length
     */
    public void setLength(String length) {
        this.length = length;
    }

    /**
     *
     * @return
     * The link
     */
    public String getLink() {
        return link;
    }

    /**
     *
     * @param link
     * The link
     */
    public void setLink(String link) {
        this.link = link;
    }

}
