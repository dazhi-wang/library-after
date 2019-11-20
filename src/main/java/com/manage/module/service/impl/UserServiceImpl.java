package com.manage.module.service.impl;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.manage.module.entity.User;
import com.manage.module.entity.UserLog;
import com.manage.module.mapper.UserMapper;
import com.manage.module.service.UserLogService;
import com.manage.module.service.UserService;
import com.manage.utils.RequestSession;
import com.manage.utils.RequestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

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
    @Autowired
    private UserLogService userLogService;
    @Override
    public User login(User user, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) {
        User resultUser = baseMapper.login(user);
        if(resultUser != null) {
            // 将用户信息存入session并将sessionId放入Cookie中返回给浏览器
            RequestSession<User> requestSession = new RequestSession<>();
//            httpServletResponse.addCookie(new Cookie("u_id",requestSession.getSessionId()));
            requestSession.setUser(resultUser);
            // 用户登录成功添加登录日志
            UserLog userLog = UserLog.builder()
                    .userId(resultUser.getId())
                    .ip(RequestUtils.getRemoteIpByServletRequest(httpServletRequest))
                    .loginTime(LocalDateTime.now())
                    .build();
            userLogService.save(userLog);
        }
        return resultUser;
    }

    @Override
    public Page<Map<String,Object>> queryPageList(Page page, User user) {
        return baseMapper.queryPageList(page,user);
    }
}
