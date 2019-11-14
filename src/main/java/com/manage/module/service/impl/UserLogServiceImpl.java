package com.manage.module.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.manage.module.entity.UserLog;
import com.manage.module.mapper.UserLogMapper;
import com.manage.module.service.UserLogService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户日志表 服务实现类
 * </p>
 *
 * @author liujiajia
 * @since 2019-11-14
 */
@Service
public class UserLogServiceImpl extends ServiceImpl<UserLogMapper, UserLog> implements UserLogService {
}
