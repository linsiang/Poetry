package com.qf.admin.service.impl;

import com.qf.admin.dao.LoginDao;
import com.qf.admin.pojo.po.People;
import com.qf.admin.service.LoginService;
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
