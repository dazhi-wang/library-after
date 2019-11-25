package com.manage.config;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import com.manage.utils.RequestSession;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.http.HttpMessageConverters;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
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
    @Value("${my-file.upload.url}")
    private String imagesPath;//图片地址
    // 配置静态资源访问
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        // 拦截所以/static/**请求，并将路径转到file本地磁盘下
        registry.addResourceHandler("/static/**").addResourceLocations("file:"+imagesPath);
    }
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // 配置拦截路径
        registry.addInterceptor(new InterceptorConfig())
                // 拦截所有请求
                .addPathPatterns("/**")
                // 不拦截请求
                .excludePathPatterns("/user/login","/static/**");
    }
}
