package nick.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nick.dao.UserMapper;
import nick.model.User;
@Service("userService")
public class UserServiceImpl implements IUserService {

	public UserMapper userDao;
	public UserMapper getUserDao() {
		return userDao;
	}
	@Autowired
	public void setUserDao(UserMapper userDao) {
		this.userDao = userDao;
	}
	public User getUser(int id) {
		// TODO Auto-generated method stub
		return userDao.selectByPrimaryKey(id);
	}
	
	public List<User> getAll(){
		return userDao.getAll();
	}
}
