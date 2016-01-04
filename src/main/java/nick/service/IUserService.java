package nick.service;

import java.util.List;

import nick.model.User;

public interface IUserService {
	
	public User getUser(int id);
	 public List<User> getAll();
}
