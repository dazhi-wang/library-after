package com.manage.module.service.impl;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.manage.module.entity.User;
import com.manage.module.mapper.UserMapper;
import com.manage.module.service.UserService;
import com.manage.utils.RequestSession;
import org.springframework.stereotype.Service;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author liujiajia
 * @since 2019-11-11
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    @Override
    public User login(User user, HttpServletResponse httpServletResponse) {
        User resultUser = baseMapper.login(user);
        if(resultUser != null) {
            RequestSession<User> requestSession = new RequestSession<>();
            httpServletResponse.addCookie(new Cookie("u_id",requestSession.getSessionId()));
            requestSession.setUser(resultUser);
        }
        return resultUser;
    }

    @Override
    public Page<User> queryPageList(Page page, User user) {
        return baseMapper.queryPageList(page,user);
    }
}
