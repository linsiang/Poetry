package com.gnnu.admin.dao;

import com.gnnu.admin.pojo.po.Poetry;
import com.gnnu.admin.pojo.vo.Page;
import com.gnnu.admin.pojo.vo.SearchByName;

import java.util.List;

public interface PageDao {


    public List<Poetry> findByPage(Page page);
    List<Poetry> findAll();

    void dedleteById(int id);

    List<Poetry> searchByName(SearchByName search);

    List<Poetry> findAllByName(String poetry_author);

    int countPage();
}
