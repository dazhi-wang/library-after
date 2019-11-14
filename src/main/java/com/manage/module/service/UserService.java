package com.manage.module.service;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.manage.module.entity.User;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * <p>
 * 用户表 服务类
 * </p>
 *
 * @author liujiajia
 * @since 2019-11-11
 */
public interface UserService extends IService<User> {
    // 用户登录
    User login(User user, HttpServletResponse httpServletResponse);
    // 查询用户列表
    Page<User> queryPageList(Page page, User user);
}
