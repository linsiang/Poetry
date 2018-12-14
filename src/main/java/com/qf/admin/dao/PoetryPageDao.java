package com.qf.admin.dao;

import com.qf.admin.pojo.po.Poetry;
import com.qf.admin.pojo.vo.PoetryPage;

import java.util.List;

public interface PoetryPageDao {

    List<Poetry> findPoetryByPage(PoetryPage poetryPage);

    void deletePoetry(int id);

    Poetry toAddPoetry();

    void reallAddPoetry(Poetry poetry);

    Poetry toUpdatePoetry(int id);

    void updatePoetry(Poetry poetry);
}
