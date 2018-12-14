package com.qf.admin.service;

import com.qf.admin.pojo.po.Poetry;
import com.qf.admin.pojo.vo.Page;
import com.qf.admin.pojo.vo.SearchByName;


import java.util.List;

public interface PageService {

    List<Poetry> findByPage(Page page);

    List<Poetry> findAll();

    void deleteById(int id);

    List<Poetry> searchByName(SearchByName search);

    List<Poetry> findALLByName(String poetry_author);
}
