package com.wsx.service;

import com.wsx.pojo.User;

import java.util.List;

/**
 * @author wsx
 * @date 2022年07月27日 19:48
 */
public interface UserService {

    /**
     * 查询用户信息
     * @param user
     * @return
     * @throws Exception
     */
    List<User> query(User user) throws Exception;

    /**
     * 添加用户
     * @param user
     * @return
     * @throws Exception
     */
    Integer addUser(User user) throws Exception;

    /**
     * 更新用户信息
     * @param user
     * @return
     * @throws Exception
     */
    Integer updateUser(User user) throws Exception;

    /**
     * 根据用户id删除用户
     * @param userId
     * @return
     * @throws Exception
     */
    Integer deleteUser(Integer userId) throws Exception;

}
