package com.huazai.service;

import java.util.List;

import com.huazai.entity.Moodirection;
import com.huazai.entity.MoodirectionBo;

public interface DirecionService {
	public String getdirName(Integer dirid);
	public List<MoodirectionBo> selectByPrimaryList(Moodirection moodirection);
}
