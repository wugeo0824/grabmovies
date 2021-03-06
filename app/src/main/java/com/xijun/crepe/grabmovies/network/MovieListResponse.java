package com.xijun.crepe.grabmovies.network;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.xijun.crepe.grabmovies.model.Dates;
import com.xijun.crepe.grabmovies.model.Movie;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by LiXijun on 2016/3/3.
 */
public class MovieListResponse {
    @SerializedName("dates")
    @Expose
    private Dates dates;
    @SerializedName("page")
    @Expose
    private Integer page;
    @SerializedName("results")
    @Expose
    private List<Movie> results = new ArrayList<Movie>();
    @SerializedName("total_pages")
    @Expose
    private Integer totalPages;
    @SerializedName("total_results")
    @Expose
    private Integer totalResults;

    /**
     *
     * @return
     * The dates
     */
    public Dates getDates() {
        return dates;
    }

    /**
     *
     * @param dates
     * The dates
     */
    public void setDates(Dates dates) {
        this.dates = dates;
    }

    /**
     *
     * @return
     * The page
     */
    public Integer getPage() {
        return page;
    }

    /**
     *
     * @param page
     * The page
     */
    public void setPage(Integer page) {
        this.page = page;
    }

    /**
     *
     * @return
     * The results
     */
    public List<Movie> getResults() {
        return results;
    }

    /**
     *
     * @param results
     * The results
     */
    public void setResults(List<Movie> results) {
        this.results = results;
    }

    /**
     *
     * @return
     * The totalPages
     */
    public Integer getTotalPages() {
        return totalPages;
    }

    /**
     *
     * @param totalPages
     * The total_pages
     */
    public void setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
    }

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
     * The total_results
     */
    public void setTotalResults(Integer totalResults) {
        this.totalResults = totalResults;
    }
}
