package org.example.services.impl;

import org.example.bean.User;
import org.example.dao.UserDao;
import org.example.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User checkLogin(User user) {
        return userDao.checkLogin(user);
    }
    
}
