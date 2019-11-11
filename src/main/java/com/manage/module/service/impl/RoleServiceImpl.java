package com.manage.module.service.impl;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.manage.module.entity.Role;
import com.manage.module.mapper.RoleMapper;
import com.manage.module.service.RoleService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 角色表 服务实现类
 * </p>
 *
 * @author liujiajia
 * @since 2019-11-11
 */
@Service
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role> implements RoleService {

}
