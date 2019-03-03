package com.gnnu.admin.service;

import com.gnnu.admin.pojo.po.Poetry;
import com.gnnu.admin.pojo.vo.Page;
import com.gnnu.admin.pojo.vo.SearchByName;


import java.util.List;

public interface PageService {

    List<Poetry> findByPage(Page page);

    List<Poetry> findAll();

    void deleteById(int id);

    List<Poetry> searchByName(SearchByName search);

    List<Poetry> findALLByName(String poetry_author);
}
