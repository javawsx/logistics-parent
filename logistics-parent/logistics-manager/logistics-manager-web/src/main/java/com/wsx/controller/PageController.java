package com.wsx.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * @Author wsx
 * @Date 2022年07月26日 21:03
 * @Description com.wsx.controller
 * @Version 1.0
 */
@Controller
public class PageController {

    /**
     * HOME页面
     *
     * @return
     */
    @RequestMapping(value = {"/", "/home"})
    public String showMain() {
        return "main";
    }

    /**
     * RestFul风格
     *
     * @return
     */
    @RequestMapping("/{path}")
    public String showPage(@PathVariable String path) {
        return path;
    }
}
