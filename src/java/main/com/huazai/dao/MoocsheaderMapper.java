package com.huazai.dao;

import java.util.List;

import com.huazai.entity.Moocsheader;

public interface MoocsheaderMapper {
    int deleteByPrimaryKey(Integer heaid);

    int insert(Moocsheader record);

    int insertSelective(Moocsheader record);

    Moocsheader selectByPrimaryKey(Integer heaid);

    int updateByPrimaryKeySelective(Moocsheader record);

    int updateByPrimaryKey(Moocsheader record);
    
    Moocsheader selectHeaId(Integer heaid);

	List<Moocsheader> findClientList(Moocsheader moocsheader);
}