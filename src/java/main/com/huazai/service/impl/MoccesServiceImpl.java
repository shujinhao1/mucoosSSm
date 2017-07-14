package com.huazai.service.impl;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.huazai.dao.MoocsheaderMapper;
import com.huazai.entity.Moocsheader;
import com.huazai.service.MoccesService;

@Service("moccesService")
public class MoccesServiceImpl implements MoccesService {
	@Autowired
	private static Logger LOOGER = Logger.getLogger(MoccesService.class);
	@Autowired
	private MoocsheaderMapper mocces;
	public String obtainMocces(Integer heaid) {
		if(heaid==null){
			LOOGER.info("obtainMocces() --  heaid  is  null");
		}
		return mocces.selectByPrimaryKey(heaid).getInsexname();
	}
	public List<Moocsheader> findClientList(Moocsheader moocsheader) {
		
		return mocces.findClientList(moocsheader); 
	}
	
}
