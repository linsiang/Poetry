package com.gnnu.admin.dao;

import com.gnnu.admin.pojo.po.People;

public interface LoginDao {
    People checkLogin(People user);
}
