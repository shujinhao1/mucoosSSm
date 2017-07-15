package com.huazai.contoller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.huazai.dao.MoocsheaderMapper;
import com.huazai.entity.Moocsheader;

@Controller
public class MoccesContoller {
	private static final String INDEXSHOW = "indexShow";
	@Autowired
	private MoocsheaderMapper headerMapper;
	@RequestMapping("indexShow")
	public String showMocces(HttpServletRequest request){
		System.out.println("111111");
		Moocsheader obj = null; 
		String str = headerMapper.selectByPrimaryKey(1).getInsexname();
		List<Moocsheader> list = headerMapper.findClientList(obj);
//		List<Moocsheader> findClientList = headerMapper.findClientList(1);
		for (Moocsheader moocsheader : list) {
			System.out.println(moocsheader);
		}
		request.setAttribute("str",str);
		return INDEXSHOW;
	}
}
