package org.example.services;

import org.example.bean.User;
import org.example.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User checkLogin(User user) {
        return userDao.checkLogin(user);
    }
    
}
