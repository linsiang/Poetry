package com.gnnu.admin.web;

import com.gnnu.admin.service.PageService;
import org.springframework.beans.factory.annotation.Autowired;

public class SelectPageFromId {

    @Autowired
   public static PageService pageService;
    public static int theCurrentPage(int id){
          int currentPage =0;
          currentPage= pageService.findPageById(id);
          return currentPage;
    }

}
