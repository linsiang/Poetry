package com.qf.admin.dao;

import com.qf.admin.pojo.po.Poetry;
import com.qf.admin.pojo.vo.Page;
import com.qf.admin.pojo.vo.SearchByName;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PageDao {


    public List<Poetry> findByPage(Page page);
    List<Poetry> findAll();

    void dedleteById(int id);

    List<Poetry> searchByName(SearchByName search);

    List<Poetry> findAllByName(String poetry_author);
}
