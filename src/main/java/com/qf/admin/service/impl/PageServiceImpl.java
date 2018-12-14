package com.qf.admin.service.impl;

import com.qf.admin.dao.PageDao;
import com.qf.admin.pojo.po.Poetry;
import com.qf.admin.pojo.vo.Page;
import com.qf.admin.pojo.vo.SearchByName;
import com.qf.admin.service.PageService;
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
}
