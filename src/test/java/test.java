
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;

import nick.model.User;
import nick.service.IUserService;




/**
 * 推荐用这种方式得到bean
 * @author Nick
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring.xml", "classpath:spring-mybatis.xml" })//获取bean
public class test {
 
	private static final Logger logger = Logger.getLogger(test.class);

	private IUserService userService;

	public IUserService getUserService() {
		return userService;
	}
	@Autowired
	public void setUserService(IUserService userService) {
		this.userService = userService;
	}
	
	@Test
	public void testGetUser(){
		User u=userService.getUser(1);
		logger.info(JSON.toJSONStringWithDateFormat(u,"yyyy-MM-dd HH:mm:SS"));
		System.out.println(u.getUserName());
	}
}

