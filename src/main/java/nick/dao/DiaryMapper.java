package nick.dao;

import nick.model.Diary;

public interface DiaryMapper {
    int deleteByPrimaryKey(Integer diaryId);

    int insert(Diary record);

    int insertSelective(Diary record);

    Diary selectByPrimaryKey(Integer diaryId);

    int updateByPrimaryKeySelective(Diary record);

    int updateByPrimaryKey(Diary record);
}