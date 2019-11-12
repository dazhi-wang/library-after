package com.manage.config;

import com.manage.module.entity.User;
import com.manage.utils.RequestSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * <p>
 * 拦截器处理类
 * </p>
 *
 * @author liujiajia
 * @since 2019-11-12
 */
public class InterceptorConfig implements HandlerInterceptor {
    // 处理拦截请求
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        RequestSession<User> requestSession = new RequestSession<>();
        // 判断用户是否处于登录状态
        Cookie[] cookies = request.getCookies();
        for(Cookie cookie : cookies) {
            if(cookie.getName().equals("u_id")) {
                if(cookie.getValue().equals(requestSession.getSessionId())) {
                    // 判断服务器端sessionId与客户端id相同则放行
                    return  true;
                }
            }
        }
        // 两个sessionId不同则返回403
        // 403 表示资源拒绝访问
        response.setStatus(403);
        return false;
    }
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable ModelAndView modelAndView) throws Exception {
    }
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable Exception ex) throws Exception {
    }
}
