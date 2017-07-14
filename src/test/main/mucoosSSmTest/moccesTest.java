package mucoosSSmTest;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.huazai.entity.Moocsheader;
import com.huazai.service.MoccesService;

public class moccesTest {

	
	@Test
	public void testMocces(){
		ApplicationContext ctx = new ClassPathXmlApplicationContext("springmybatis.xml");
		MoccesService moccesService = (MoccesService) ctx.getBean("moccesService");
//		String s = moccesService.obtainMocces(1);
		Moocsheader object=new Moocsheader();
		List<Moocsheader> findClientList = moccesService.findClientList(object);
		for (Moocsheader moocsheader : findClientList) {
			System.out.println(moocsheader.toString());
		}
//		System.out.println(s);5464
	}
	
}
