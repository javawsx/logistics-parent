package com.wsx.controller;

import com.wsx.pojo.Role;
import com.wsx.service.UserService;
import com.wsx.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @Author wsx
 * @Date 2022年07月27日 19:54
 * @Description com.wsx.controller
 * @Version 1.0
 */
@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/query")
    public String query(User user, Model model) throws Exception {
        List<User> list = userService.query(user);
        model.addAttribute("list",list);
        return "user/user";
    }

    @RequestMapping("/saveOrUpdate")
    public String saveOrUpdate(User user) throws Exception {
        userService.addUser(user);
        return "redirect:/updateUser";
    }


}
