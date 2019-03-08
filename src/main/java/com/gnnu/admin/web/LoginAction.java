package com.gnnu.admin.web;

import com.gnnu.admin.pojo.po.People;
import com.gnnu.admin.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginAction {
   @Autowired
  private  LoginService loginService;
    @ResponseBody
    @RequestMapping(value = "/login")
    public People loginServlet(People user){

       user = loginService.chechLogin(user);
       //System.out.println(user);
       return user;
    }
}
