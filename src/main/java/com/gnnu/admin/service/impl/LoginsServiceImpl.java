package com.gnnu.admin.service.impl;

import com.gnnu.admin.dao.LoginDao;
import com.gnnu.admin.pojo.po.People;
import com.gnnu.admin.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginsServiceImpl implements LoginService {
   @Autowired
   private LoginDao loginDao;
    @Override
    public People chechLogin(People user) {
        return  loginDao.checkLogin(user);

    }
}
