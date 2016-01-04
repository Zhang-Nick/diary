package nick.dao;

import java.util.List;

import nick.model.User;

public interface UserMapper {
    int deleteByPrimaryKey(Integer pkUserId);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer pkUserId);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
    
    List<User> getAll();
}