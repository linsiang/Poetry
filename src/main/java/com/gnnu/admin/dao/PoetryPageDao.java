package com.gnnu.admin.dao;

import com.gnnu.admin.pojo.po.Poetry;
import com.gnnu.admin.pojo.vo.PoetryPage;

import java.util.List;

public interface PoetryPageDao {

    List<Poetry> findPoetryByPage(PoetryPage poetryPage);

    void deletePoetry(int id);

    Poetry toAddPoetry();

    void reallAddPoetry(Poetry poetry);

    Poetry toUpdatePoetry(int id);

    void updatePoetry(Poetry poetry);
}
