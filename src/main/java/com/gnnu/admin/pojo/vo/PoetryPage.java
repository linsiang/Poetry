package com.gnnu.admin.pojo.vo;

import com.gnnu.admin.pojo.po.Poetry;

import java.util.List;

public class PoetryPage {

      private int currentPage=1;
      private int totalPage;
      private int pageSize=10;
      private int offset;
      private List<Poetry> poetryDate;

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = (currentPage-1)*pageSize;
    }

    public List<Poetry> getPoetryDate() {
        return poetryDate;
    }

    public void setPoetryDate(List<Poetry> poetryDate) {
        this.poetryDate = poetryDate;
    }

    public PoetryPage() {
    }

    @Override
    public String toString() {
        return "PoetryPage{" +
                "currentPage=" + currentPage +
                ", totalPage=" + totalPage +
                ", pageSize=" + pageSize +
                ", offset=" + offset +
                ", poetryDate=" + poetryDate +
                '}';
    }
}
