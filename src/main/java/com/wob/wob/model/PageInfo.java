package com.wob.wob.model;

import com.google.gson.annotations.Expose;

/**
 * Created by Tal on 18/06/2015.
 */
public class PageInfo {

    @Expose
    private Integer totalResults;
    @Expose
    private Integer resultsPerPage;

    /**
     *
     * @return
     * The totalResults
     */
    public Integer getTotalResults() {
        return totalResults;
    }

    /**
     *
     * @param totalResults
     * The totalResults
     */
    public void setTotalResults(Integer totalResults) {
        this.totalResults = totalResults;
    }

    /**
     *
     * @return
     * The resultsPerPage
     */
    public Integer getResultsPerPage() {
        return resultsPerPage;
    }

    /**
     *
     * @param resultsPerPage
     * The resultsPerPage
     */
    public void setResultsPerPage(Integer resultsPerPage) {
        this.resultsPerPage = resultsPerPage;
    }

}
