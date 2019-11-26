package com.zsl.springboot.bootdemo.service.impl;

import com.zsl.springboot.bootdemo.dao.UsersDao;
import com.zsl.springboot.bootdemo.model.UserModel;
import com.zsl.springboot.bootdemo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserServiceImpl implements IUserService {

    @Autowired
    private UsersDao userDao;

    @Override
    public boolean login(String username, String passwd) {
        UserModel users = userDao.findByUsernameAndPasswd(username, passwd);
        return users != null;
    }

    @Override
    public boolean register(String username, String passwd) {
        UserModel users = new UserModel();
        users.setUsername(username);
        users.setPasswd(passwd);
        int cnt = userDao.insertSelective(users);
        return cnt > 0;
    }

    @Override
    @Transactional
    public void batchAdd(String username, String passwd) {
        UserModel users = new UserModel();
        users.setUsername(username);
        users.setPasswd(passwd);
        userDao.insertSelective(users);
        int i = 10 /0;
        users = new UserModel();
        users.setUsername(username+"2");
        users.setPasswd(passwd);
        userDao.insertSelective(users);
    }
}
