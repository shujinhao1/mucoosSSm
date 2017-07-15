package com.huazai.dao;

import java.util.List;

import com.huazai.entity.Moodirection;
import com.huazai.entity.MoodirectionBo;

public interface MoodirectionMapper {
    int deleteByPrimaryKey(Integer dirid);

    int insert(Moodirection record);

    int insertSelective(Moodirection record);

    Moodirection selectByPrimaryKey(Integer dirid);

    int updateByPrimaryKeySelective(Moodirection record);

    int updateByPrimaryKey(Moodirection record);
    
    List<MoodirectionBo> selectByPrimaryList(Moodirection moodirection);
}