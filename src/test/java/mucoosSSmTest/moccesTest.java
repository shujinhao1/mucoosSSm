package mucoosSSmTest;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.huazai.entity.Moodirection;
import com.huazai.entity.MoodirectionBo;
import com.huazai.service.DirecionService;

public class moccesTest {

	
	@Test
	public void testMocces(){
		ApplicationContext ctx = new ClassPathXmlApplicationContext("springmybatis.xml");
//		MoccesService moccesService = (MoccesService) ctx.getBean("moccesService");
//		String s = moccesService.obtainMocces(2);
//		Moocsheader object = new Moocsheader();
//		List<Moocsheader> findClientList = moccesService.findClientList(object);
//		for (Moocsheader moocsheader : findClientList) {
//			System.out.println(moocsheader.toString());
//		}
//		
//		System.out.println(s);
		DirecionService direcionService = (DirecionService) ctx.getBean("direcionService");
		String s1 = direcionService.getdirName(1);
		System.out.println(s1);
		Moodirection mood = new Moodirection();
		mood.setPdirid(5);
		List<MoodirectionBo> lists = direcionService.selectByPrimaryList(mood);
		for (MoodirectionBo moodirections : lists) {
			System.out.println(moodirections.toString());
		}
		
	}
	
}
