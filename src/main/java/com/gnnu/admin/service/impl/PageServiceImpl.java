package com.gnnu.admin.service.impl;

import com.gnnu.admin.dao.PageDao;
import com.gnnu.admin.pojo.po.Poetry;
import com.gnnu.admin.pojo.vo.Page;
import com.gnnu.admin.pojo.vo.SearchByName;
import com.gnnu.admin.service.PageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PageServiceImpl implements PageService {
    @Autowired
    private PageDao pageDao;
    @Override
    public List<Poetry> findByPage(Page page) {
     return  pageDao.findByPage(page);

    }

    @Override
    public List<Poetry> findAll() {
       return  pageDao.findAll();
    }

    @Override
    public void deleteById(int id) {
         pageDao.dedleteById(id);
    }

    @Override
    public List<Poetry> searchByName(SearchByName search) {
        return  pageDao.searchByName(search);
    }

    @Override
    public List<Poetry> findALLByName(String poetry_author) {
        return pageDao.findAllByName(poetry_author);
    }

    @Override
    public int findPageById(int id) {
        Page page = new Page();
        //得到总的数据是pageCount
        int pageCount=0;
        pageCount= pageDao.countPage();
        System.out.println(pageCount);

        //当前页的计算为（pageCount-1）/pageSize
        int currentPage = (pageCount-1)/page.getPageSize();
        return currentPage;
    }


}
