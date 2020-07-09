package com.nin.common.pojo;

import java.util.List;

/**
 * Created by Hunter on 2020-01-10.
 */
public class Page<T> {

    private Integer pageNo = 1;
    private Integer pageSize = 10;
    private Integer rows;
    private Integer pageCount;
    private List<T> list;

    public Integer getPageNo() {
        return pageNo;
    }

    public void setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getRows() {
        return rows;
    }

    public void setRows(Integer rows) {
        this.rows = rows;
    }

    public Integer getPageCount() {
        return pageCount;
    }

    public void setPageCount(Integer pageCount) {
        this.pageCount = pageCount;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "Page{" +
                "pageNo=" + pageNo +
                ", pageSize=" + pageSize +
                ", rows=" + rows +
                ", pageCount=" + pageCount +
                ", list=" + list +
                '}';
    }
}
