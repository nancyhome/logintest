package com.b505.demotest.code.service;

import com.b505.demotest.code.entity.user;

public interface loginService {
    public user getUser(String username, String password);
    public void insertUser(user user);
}
