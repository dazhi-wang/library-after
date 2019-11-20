package com.manage.module.controller;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.manage.module.entity.User;
import com.manage.module.service.UserService;
import com.manage.utils.R;
import com.manage.utils.RequestSession;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Update;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    public R login(HttpServletRequest httpServletRequest,HttpServletResponse response,@RequestBody User user) {
        return  new R(userService.login(user,httpServletRequest,response));
    }
    // 用户注册
    @PostMapping("/save")
    public R save(@RequestBody User user){
        RequestSession<User> requestSession = new RequestSession<>();
        User userSession = requestSession.getUser();
        user.setCreadId(userSession.getId());
        user.setCreadName(userSession.getHolder());
        return new R(userService.save(user));
    }
    // 用户列表
    @GetMapping("/page")
    public R<Page> page(Page page,User user) {
        return new R(userService.queryPageList(page,user));
    }

    // 根据用户ID查询用户详情
    @GetMapping("/queryById")
    public R<User> queryById(String id) {
        return new R(userService.getById(id));
    }

    // 修改用户
    @PutMapping("/update")
    public R update(@RequestBody User user) {
        return new R(userService.updateById(user));
    }

    // 删除用户
    @DeleteMapping("/delete")
    public R delete(@RequestBody User user) {
        user.setDelFlag("-1");
        return new R(userService.updateById(user));
    }
}

