
import java.util.ArrayList;

import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.alibaba.fastjson.JSON;

import nick.model.User;
import nick.service.IUserService;





public class test2 {
	
	private static final Logger logger = Logger.getLogger(test2.class);
	private ApplicationContext ac;
	private IUserService userService;
	public IUserService getUserService() {
		return userService;
	}
	
	@Autowired
	public void setUserService(IUserService userService) {
		this.userService = userService;
	}

	/**
	 * 获取srping上下文，得到bean,不推荐在这种框架下用
	 */
	@Before
	public void before(){
		ac = new ClassPathXmlApplicationContext(new String[]{"spring.xml","spring-mybatis.xml"});
		userService = (IUserService)ac.getBean("userService");
	}
	
	@Test
	public void gettest1(){
		ArrayList<User> list = (ArrayList<User>) userService.getAll();
		logger.info(JSON.toJSON(list));
		System.out.println(list);
	}
	
}

