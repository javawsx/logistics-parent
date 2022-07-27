package com.wsx.service;

import com.wsx.pojo.Role;
import java.util.List;

/**
 * @author wsx
 * @date 2022年07月27日 22:46
 */
public interface RoleService {
    /**
     * 查询角色信息
     * @param role
     * @return
     * @throws Exception
     */
    List<com.wsx.pojo.Role> query(Role role) throws Exception;

    /**
     * 添加角色
     * @param role
     * @return
     * @throws Exception
     */
    Integer addRole(Role role) throws Exception;

    /**
     * 更新角色
     * @param role
     * @return
     * @throws Exception
     */
    Integer updateRole(Role role) throws Exception;

    /**
     * 根据角色id删除角色
     * @param roleId
     * @return
     * @throws Exception
     */
    Integer deleteRole(Integer roleId) throws Exception;
}
