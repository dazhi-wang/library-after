package com.manage.module.mapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.manage.module.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * 用户表 Mapper 接口
 * </p>
 *
 * @author liujiajia
 * @since 2019-11-11
 */
public interface UserMapper extends BaseMapper<User> {
    // 用户登录
    User login(User user);
    // 查询用户列表
    Page<Map<String,Object>> queryPageList(Page page, User user);
}
