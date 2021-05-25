package com.b505.demotest.code.service.impl;

import com.b505.demotest.code.dao.userDao;
import com.b505.demotest.code.entity.user;
import com.b505.demotest.code.service.loginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class loginServiceImpl implements loginService {

    @Autowired
    private userDao userDao;

    @Override
    public user getUser(String username, String password) {
        return userDao.getByPasswordAndUsername(username,password);
    }

    @Override
    public void insertUser(user user) {
        userDao.save(user);
    }

}
