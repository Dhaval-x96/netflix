package com.web.netflix.json.resource;

import com.web.netflix.entity.NetflixTitle;

import java.util.List;
import java.util.Map;

public class NetflixTitlePage {

    private Integer number;
    private Integer numberOfElements;
    private Integer size;
    private Integer totalElements;
    private Integer totalPages;
    private boolean first;
    private boolean last;
    private List<Map<String, String>> sort;
    List<NetflixTitle> netflixTitles;

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Integer getNumberOfElements() {
        return numberOfElements;
    }

    public void setNumberOfElements(Integer numberOfElements) {
        this.numberOfElements = numberOfElements;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Integer getTotalElements() {
        return totalElements;
    }

    public void setTotalElements(Integer totalElements) {
        this.totalElements = totalElements;
    }

    public Integer getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
    }

    public boolean isFirst() {
        return first;
    }

    public void setFirst(boolean first) {
        this.first = first;
    }

    public boolean isLast() {
        return last;
    }

    public void setLast(boolean last) {
        this.last = last;
    }

    public List<Map<String, String>> getSort() {
        return sort;
    }

    public void setSort(List<Map<String, String>> sort) {
        this.sort = sort;
    }

    public List<NetflixTitle> getNetflixTitles() {
        return netflixTitles;
    }

    public void setNetflixTitles(List<NetflixTitle> netflixTitles) {
        this.netflixTitles = netflixTitles;
    }

    @Override
    public String toString() {
        return "NetflixTitlePage{" +
                "number=" + number +
                ", numberOfElements=" + numberOfElements +
                ", size=" + size +
                ", totalElements=" + totalElements +
                ", totalPages=" + totalPages +
                ", first=" + first +
                ", last=" + last +
                ", sort=" + sort +
                ", netflixTitles=" + netflixTitles +
                '}';
    }
}
