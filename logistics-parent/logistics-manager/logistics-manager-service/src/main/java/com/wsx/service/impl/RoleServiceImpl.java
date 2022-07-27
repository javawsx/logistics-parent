package com.wsx.service.impl;

import com.wsx.mapper.RoleMapper;
import com.wsx.pojo.Role;
import com.wsx.pojo.RoleExample;
import com.wsx.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author wsx
 * @Date 2022年07月27日 23:28
 * @Description com.wsx.service.impl
 * @Version 1.0
 */
@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleMapper roleMapper;

    @Override
    public List<Role> query(Role role) throws Exception {
        RoleExample example = new RoleExample();
        return roleMapper.selectByExample(example);
    }

    @Override
    public Integer addRole(Role role) throws Exception {
        return roleMapper.insert(role);
    }

    @Override
    public Integer updateRole(Role role) throws Exception {
        return roleMapper.updateByPrimaryKey(role);
    }

    @Override
    public Integer deleteRole(Integer roleId) throws Exception {
        return roleMapper.deleteByPrimaryKey(roleId);
    }
}
