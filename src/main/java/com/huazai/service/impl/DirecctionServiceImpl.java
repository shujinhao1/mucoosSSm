package com.huazai.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.huazai.dao.MoodirectionMapper;
import com.huazai.entity.Moodirection;
import com.huazai.entity.MoodirectionBo;
import com.huazai.service.DirecionService;

@Service("direcionService")
public class DirecctionServiceImpl implements DirecionService {
	
	@Autowired
	private MoodirectionMapper direction;
	@Override
	public String getdirName(Integer dirid) {
		// TODO Auto-generated method stub
		String s = direction.selectByPrimaryKey(dirid).getDirname();
		
		return s;
	}
	@Override
	public List<MoodirectionBo> selectByPrimaryList(Moodirection moodirection) {
		// TODO Auto-generated method stub
		List<MoodirectionBo> list = direction.selectByPrimaryList(moodirection);
		return list;
	}

}
