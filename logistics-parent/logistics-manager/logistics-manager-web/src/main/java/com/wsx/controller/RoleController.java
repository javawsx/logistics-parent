package com.wsx.controller;

import com.wsx.pojo.Role;
import com.wsx.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @Author wsx
 * @Date 2022年07月28日 1:03
 * @Description com.wsx.controller
 * @Version 1.0
 */
@Controller
@RequestMapping("/role")
public class RoleController {

    @Autowired
    private RoleService roleService;

    @GetMapping("/query")
    public String query(Role role, Model model) throws Exception {
        List<Role> list = roleService.query(role);
        model.addAttribute("list", list);
        return "role/role";
    }

    /**
     * 处理页面跳转
     * @return
     */
    @RequestMapping("/roleDispatch")
    public String handlePageDispatch(Integer id){

        return "role/updateRole";
    }

    @RequestMapping("/saveOrUpdate")
    public String saveOrUpdate(Role role) throws Exception {
        roleService.addRole(role);
        return "redirect:/role/query";
    }
}
