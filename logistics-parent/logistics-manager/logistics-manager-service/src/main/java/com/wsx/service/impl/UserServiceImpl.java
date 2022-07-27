package com.wsx.service.impl;

import com.wsx.service.UserService;
import com.wsx.mapper.UserMapper;
import com.wsx.pojo.User;
import com.wsx.pojo.UserExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author wsx
 * @Date 2022年07月27日 19:52
 * @Description com.wsx.service.impl
 * @Version 1.0
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> query(User user) throws Exception {
        UserExample example = new UserExample();
        return userMapper.selectByExample(example);
    }

    @Override
    public Integer addUser(User user) throws Exception {
        return userMapper.insert(user);
    }

    @Override
    public Integer updateUser(User user) throws Exception {
        return userMapper.updateByPrimaryKey(user);
    }

    @Override
    public Integer deleteUser(Integer userId) throws Exception {
        return userMapper.deleteByPrimaryKey(userId);
    }
}
