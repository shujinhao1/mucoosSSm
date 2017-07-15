package com.huazai.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.huazai.dao.MoocsheaderMapper;
import com.huazai.entity.Moocsheader;
import com.huazai.service.MoccesService;

@Service("moccesService")
public class MoccesServiceImpl implements MoccesService {

	@Autowired
	private MoocsheaderMapper headerMapper;
	@Override
	public String obtainMocces(Integer heaid) {
		// TODO Auto-generated method stub
		String str = headerMapper.selectByPrimaryKey(heaid).getInsexname();
		
		return str;
	}

	@Override
	public List<Moocsheader> findClientList(Moocsheader moocsheader) {
		List<Moocsheader> list = headerMapper.findClientList(moocsheader);
		System.out.println("22222222222");
		return list;
	}

}
