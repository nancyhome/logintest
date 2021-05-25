package com.b505.demotest.code.dao;

import com.b505.demotest.code.entity.user;
import org.springframework.data.jpa.repository.JpaRepository;

public interface userDao extends JpaRepository<user, Integer> {
    public user getByPasswordAndUsername(String username,String password);
}
