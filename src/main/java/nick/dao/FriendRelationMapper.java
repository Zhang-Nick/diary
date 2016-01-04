package nick.dao;

import nick.model.FriendRelation;

public interface FriendRelationMapper {
    int deleteByPrimaryKey(Integer friendId);

    int insert(FriendRelation record);

    int insertSelective(FriendRelation record);

    FriendRelation selectByPrimaryKey(Integer friendId);

    int updateByPrimaryKeySelective(FriendRelation record);

    int updateByPrimaryKey(FriendRelation record);
}