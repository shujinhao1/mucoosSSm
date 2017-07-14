package com.huazai.service;

import java.util.List;

import com.huazai.entity.Moocsheader;

public interface MoccesService {
	public String obtainMocces(Integer heaid);
	public List<Moocsheader> findClientList(Moocsheader moocsheader) ;
}
