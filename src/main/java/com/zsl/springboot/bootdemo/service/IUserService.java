package com.zsl.springboot.bootdemo.service;

import com.zsl.springboot.bootdemo.model.UserModel;

public interface IUserService {
    boolean login(String username,String passwd);
    boolean register(String username,String passwd);
    void batchAdd(String username,String passwd);
    UserModel getUser(String username);
}
