package com.gnnu.admin.web;

import com.gnnu.admin.pojo.po.Author;
import com.gnnu.admin.pojo.po.Poetry;
import com.gnnu.admin.pojo.vo.Page;
import com.gnnu.admin.pojo.vo.SearchByName;
import com.gnnu.admin.service.PageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class PageAction {

    @Autowired
    private PageService pageService;

    @RequestMapping(value = "pageVo")
    public String findByPage(Page page, Model model) {
        //找到所有的,然后得出总页数
        int a = (page.getCurrentPage() - 1) * page.getPageSize();
        List<Poetry> list = pageService.findAll();
        page.setPageCount(list.size());
        page.setOffset(a);
        page.setListDate(pageService.findByPage(page)); //找到所有Poetry相关的数据
        page.setTotalPage((page.getPageCount() + page.getPageSize() - 1) / page.getPageSize());
        int totalPage = page.getTotalPage();
        if (totalPage < 10) {
            page.setBeginPage(1);
            page.setEndPage(page.getTotalPage());
        } else {
            if (page.getCurrentPage() >= 1 && page.getCurrentPage() <= 5) {
                page.setBeginPage(1);
                page.setEndPage(10);
            }
            if (page.getCurrentPage() > 5 && (page.getCurrentPage() + 5) < page.getTotalPage()) {
                page.setBeginPage(page.getCurrentPage() - 5);
                page.setEndPage(page.getCurrentPage() + 5);
            }
            if (page.getCurrentPage() > 5 && (page.getCurrentPage() + 5) > page.getTotalPage()) {
                page.setBeginPage(page.getCurrentPage() - 5);
                page.setEndPage(page.getTotalPage());
            }
        }

        model.addAttribute("page", page);  //放到request域中
        // return "cebianlan";
        return "PageByVo";
    }

    @RequestMapping(value = "/deleteById", method = RequestMethod.GET)
    public String deleteById(int id) {
        pageService.deleteById(id);
        return "redirect:pageVo";
    }

    @RequestMapping(value = "/searchByName")
    public String searchByName(String poetry_author, Page page, Model model) {
        SearchByName search = new SearchByName();
        if (poetry_author != null) {
            Author.setPoetry_author(poetry_author);
        }
        if (poetry_author == null) {
            poetry_author = Author.getPoetry_author();
        }

        int a = (page.getCurrentPage() - 1) * page.getPageSize();
        // page.setOffset(a);
        search.setPoetry_author(poetry_author);
        search.setOffset(a);
        search.setPageSize(9);
        //先找到所有的再说
        List<Poetry> list = pageService.findALLByName(poetry_author);
        //得出总的数据，方便后面算页数
        page.setPageCount(list.size());
        page.setTotalPage((page.getPageCount() + page.getPageSize() - 1) / page.getPageSize());
        //得到每一页的数据
        List<Poetry> list1 = pageService.searchByName(search);
        //把得到的数据放到page.listate中
        page.setListDate(list1);
        int totalPage = page.getTotalPage();
        if (totalPage < 10) {
            page.setBeginPage(1);
            page.setEndPage(page.getTotalPage());
        } else {
            if (page.getCurrentPage() >= 1 && page.getCurrentPage() <= 5) {
                page.setBeginPage(1);
                page.setEndPage(10);
            }
            if (page.getCurrentPage() > 5 && (page.getCurrentPage() + 5) < page.getTotalPage()) {
                page.setBeginPage(page.getCurrentPage() - 5);
                page.setEndPage(page.getCurrentPage() + 5);
            }
            if (page.getCurrentPage() > 5 && (page.getCurrentPage() + 5) > page.getTotalPage()) {
                page.setBeginPage(page.getCurrentPage() - 5);
                page.setEndPage(page.getTotalPage());
            }
        }

        //  System.out.println(page);
        model.addAttribute("page", page);
        return "PageByVoByName";
    }

}
