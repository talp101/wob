package com.wob.wob.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Tal on 18/06/2015.
 */
public class Thumbnails {

    @SerializedName("default")
    @Expose
    private Default _default;
    @Expose
    private Medium medium;
    @Expose
    private High high;

    /**
     *
     * @return
     * The _default
     */
    public Default getDefault() {
        return _default;
    }

    /**
     *
     * @param _default
     * The default
     */
    public void setDefault(Default _default) {
        this._default = _default;
    }

    /**
     *
     * @return
     * The medium
     */
    public Medium getMedium() {
        return medium;
    }

    /**
     *
     * @param medium
     * The medium
     */
    public void setMedium(Medium medium) {
        this.medium = medium;
    }

    /**
     *
     * @return
     * The high
     */
    public High getHigh() {
        return high;
    }

    /**
     *
     * @param high
     * The high
     */
    public void setHigh(High high) {
        this.high = high;
    }

}