package com.gnnu.admin.pojo.po;

public class People {
    private String uname;
    private String pwd;

    @Override
    public String toString() {
        return "People{" +
                "uname='" + uname + '\'' +
                ", pwd='" + pwd + '\'' +
                '}';
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public People() {
    }
}
