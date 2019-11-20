package com.manage.module.controller;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.manage.module.entity.Role;
import com.manage.module.entity.User;
import com.manage.module.service.RoleService;
import com.manage.utils.R;
import com.manage.utils.RequestSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 * 角色表 前端控制器
 * </p>
 *
 * @author liujiajia
 * @since 2019-11-11
 */
@RestController
@RequestMapping("/role")
public class RoleController {
    @Autowired
    private RoleService roleService;
    // 查询角色列表
    @GetMapping("/page")
    public R page(Page page, Role role) {
        return new R(roleService.page(page, Wrappers.<Role>query().lambda().eq(Role::getDelFlag,"0")));
    }
    // 查询角色详情
    @GetMapping("/queryById")
    public R queryById(String id) {
        return new R(roleService.getById(id));
    }
    // 添加角色
    @PostMapping("/save")
    public R save(@RequestBody Role role) {
        RequestSession requestSession = new RequestSession();
        User user = requestSession.getUser();
        role.setCreateId(user.getId());
        role.setCreateName(user.getUsername());
        return new R(roleService.save(role));
    }
    // 修改角色
    @PutMapping("/update")
    public R update(@RequestBody Role role) {
        return new R(roleService.updateById(role));
    }
    // 删除角色
    @DeleteMapping("/delete")
    public R delete(@RequestBody Role role) {
        role.setDelFlag("-1");
        return new R(roleService.updateById(role));
    }
}

