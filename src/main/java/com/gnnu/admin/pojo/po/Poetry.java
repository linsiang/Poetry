package com.gnnu.admin.pojo.po;

public class Poetry {
    private int poetry_id;
    private String poetry_title;
    private String poetry_body;
    private String poetry_author;
    private String poetry_dynasty;

    public Poetry() {
    }

    public int getPoetry_id() {
        return poetry_id;
    }

    public void setPoetry_id(int poetry_id) {
        this.poetry_id = poetry_id;
    }

    public String getPoetry_title() {
        return poetry_title;
    }

    public void setPoetry_title(String poetry_title) {
        this.poetry_title = poetry_title;
    }

    public String getPoetry_body() {
        return poetry_body;
    }

    public void setPoetry_body(String poetry_body) {
        this.poetry_body = poetry_body;
    }

    public String getPoetry_author() {
        return poetry_author;
    }

    public void setPoetry_author(String poetry_author) {
        this.poetry_author = poetry_author;
    }

    public String getPoetry_dynasty() {
        return poetry_dynasty;
    }

    public void setPoetry_dynasty(String poetry_dynasty) {
        this.poetry_dynasty = poetry_dynasty;
    }

    @Override
    public String toString() {
        return "Poetry{" +
                "poetry_id=" + poetry_id +
                ", poetry_title='" + poetry_title + '\'' +
                ", poetry_body='" + poetry_body + '\'' +
                ", poetry_author='" + poetry_author + '\'' +
                ", poetry_dynasty='" + poetry_dynasty + '\'' +
                '}';
    }
}
