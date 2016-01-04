package nick.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.alibaba.fastjson.JSON;

import nick.model.User;
import nick.service.IUserService;

@Controller
@RequestMapping(value="/user")
public class UserController {
	
	private IUserService userService;
	public IUserService getUserService() {
		return userService;
	}
	@Autowired
	public void setUserService(IUserService userService) {
		this.userService = userService;
	}
	
	@RequestMapping(value="getUser1")
	public String getUser(@RequestParam int id,HttpServletRequest request){
		User user = userService.getUser(id);
		request.setAttribute("us", user);
		return "showUser";
	}
	
	@RequestMapping(value="/{id}/getUser2")
	public String getUser2(@PathVariable int id,HttpServletRequest request){
		User user = userService.getUser(id);
		System.out.println(user.getUserName());
		request.setAttribute("us", user);
		return "showUser";
	}
	
	@RequestMapping("getAll")
	public String getUserDiary(){
		ArrayList<User> list = (ArrayList<User>) userService.getAll();
		System.out.println("-------------here-----------");
		return "showUser";
	}
}
