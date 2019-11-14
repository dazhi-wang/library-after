package com.manage.module.controller;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.manage.module.entity.User;
import com.manage.module.service.UserService;
import com.manage.utils.R;
import com.manage.utils.RequestSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * <p>
 * 用户表 前端控制器
 * </p>
 *
 * @author liujiajia
 * @since 2019-11-11
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    // 用户登录接口
    @PostMapping("/login")
    public R login(HttpServletResponse response,@RequestBody User user) {
        return  new R(userService.login(user,response));
    }
    // 用户注册
    @PostMapping("/save")
    public R save(HttpServletRequest request){
        RequestSession<User> requestSession = new RequestSession<>();
        User user = requestSession.getSession("user");
        return null;
    }
    // 用户列表
    @GetMapping("/page")
    public R<Page> page(Page page,User user) {
        return new R(userService.queryPageList(page,user));
    }
}

