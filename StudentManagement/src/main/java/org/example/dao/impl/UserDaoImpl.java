package org.example.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.example.bean.User;
import org.example.dao.UserDao;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {

    @Override
    public User checkLogin(User user) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'checkLogin'");
    }
    
}

class UserRowMapper implements RowMapper<User> {

    @Override
    @Nullable
    public User mapRow(ResultSet resultSet, int iValue) throws SQLException {
        User user = new User();
        user.setUserName(resultSet.getString("user_name"));
        user.setPassword(resultSet.getString("password"));
        return user;
    }
}