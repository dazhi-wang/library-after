package com.manage.module.service.impl;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.manage.module.entity.User;
import com.manage.module.mapper.UserMapper;
import com.manage.module.service.UserService;
import org.springframework.stereotype.Service;

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

}
