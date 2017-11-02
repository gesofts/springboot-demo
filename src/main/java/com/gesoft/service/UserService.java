package com.gesoft.service;

import com.gesoft.domain.User;
import com.gesoft.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by WCL on 2017/10/31.
 */
@Service
public class UserService
{
    @Autowired
    UserMapper userMapper;

    public User getUserById(long id)
    {
        return userMapper.getUserById(id);
    }
}
