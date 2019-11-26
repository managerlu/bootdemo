package com.zsl.springboot.bootdemo.dao;


import com.zsl.springboot.bootdemo.model.UserModel;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

//@Mapper
public interface UsersDao {
    int deleteByPrimaryKey(Integer id);

    int insert(UserModel record);

    int insertSelective(UserModel record);

    UserModel selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserModel record);

    int updateByPrimaryKey(UserModel record);

    UserModel findByUsernameAndPasswd(@Param("username") String username, @Param("passwd") String passwd);
}
