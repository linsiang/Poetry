package com.gnnu.admin.web;

import com.gnnu.admin.dao.UserDao;
import com.gnnu.admin.pojo.po.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class UserAction {
    @Autowired
    private UserDao userDao;
     @RequestMapping(value = "/listUsers", method=RequestMethod.GET)
    public String listUsers(Model model){
         List<User> list  = userDao.listUsers();
         model.addAttribute("list",list);
         return "index";
         }
      @RequestMapping(value = "/fucker" )
    public String shit(){
         return "poetryIndex";
      }

     @GetMapping("/{path}")
    public String path(@PathVariable String path){
         return path;
     }

}
