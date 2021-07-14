package cn.dotalk.usermanage.mapper;

import cn.dotalk.usermanage.entity.UserSimple;

public interface UserSimpleDao {
    int deleteByPrimaryKey(Integer id);

    int insert(UserSimple record);

    int insertSelective(UserSimple record);

    UserSimple selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserSimple record);

    int updateByPrimaryKey(UserSimple record);
}