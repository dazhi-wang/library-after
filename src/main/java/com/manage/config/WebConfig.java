package com.manage.config;

import com.manage.utils.RequestSession;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
/**
 * <p>
 *  拦截器
 * </p>
 *
 * @author liujiajia
 * @since 2019-11-12
 */
@Configuration
public class WebConfig extends WebMvcConfigurationSupport {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // 配置拦截路径
        registry.addInterceptor(new InterceptorConfig()).excludePathPatterns("/user/login").addPathPatterns("/**");
    }
}
