package com.qf.admin.dao;

import com.qf.admin.pojo.po.People;

public interface LoginDao {
    People checkLogin(People user);
}
