package com.gnnu.admin.pojo.vo;

public class SearchByName {
    private String poetry_author;
    private int offset;
    private int pageSize;

    public SearchByName() {
    }

    public String getPoetry_author() {
        return poetry_author;
    }

    public void setPoetry_author(String poetry_author) {
        this.poetry_author = poetry_author;
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    @Override
    public String toString() {
        return "SearchByName{" +
                "poetry_author='" + poetry_author + '\'' +
                ", offset=" + offset +
                ", pageSize=" + pageSize +
                '}';
    }
}
