package com.gnnu.admin.pojo.po;

public class Author {
    public static String poetry_author;

    public static String getPoetry_author() {
        return poetry_author;
    }

    public static void setPoetry_author(String poetry_author) {
        Author.poetry_author = poetry_author;
    }

    public Author() {
    }

    @Override
    public String toString() {
        return "Author{}";
    }

}
