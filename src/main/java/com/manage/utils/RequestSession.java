package com.manage.utils;

import com.manage.module.entity.User;
import org.apache.tomcat.util.http.fileupload.RequestContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.RequestContextListener;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
/**
 * <p>
 * 简单Session会话管理
 * </p>
 *
 * @author liujiajia
 * @since 2019-11-12
 */
public class RequestSession<T> {
    private HttpSession httpSession;
    private HttpServletRequest httpServletRequest;
    public RequestSession() {
        httpServletRequest  = ((ServletRequestAttributes)RequestContextHolder.getRequestAttributes()).getRequest();
        httpSession = httpServletRequest.getSession();
        httpSession.setMaxInactiveInterval(30*60);
    }
    public void setSession(String key,Object object) {
        httpSession.setAttribute(key,object);
    }
    public T getSession(String key) {
        return (T)httpSession.getAttribute(key);
    }
    public String getSessionId() {
        return httpSession.getId();
    }
    public User getUser() {
        return (User) httpSession.getAttribute("user");
    }
    public void setUser(User user) {
        httpSession.setAttribute("user",user);
    }
}
