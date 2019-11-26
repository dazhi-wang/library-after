package com.manage.module.controller;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.manage.module.entity.Books;
import com.manage.module.entity.Readers;
import com.manage.module.service.ReadersService;
import com.manage.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 * 读者表 前端控制器
 * </p>
 *
 * @author liujiajia
 * @since 2019-11-11
 */
@RestController
@RequestMapping("/readers")
public class ReadersController {
    @Autowired
    private ReadersService readersService;

    // 分页查询读者列表
    @GetMapping("/page")
    public R page(Page page, Readers readers) {
        return new R(readersService.page(page, Wrappers.lambdaQuery(readers)));
    }

    // 新增读者
    @PostMapping("/save")
    public R save(@RequestBody Readers readers) {
        return new R(readersService.save(readers));
    }

    // 修改读者
    @PutMapping("/update")
    public R update(@RequestBody Readers readers) {
        return new R(readersService.updateById(readers));
    }

    // 删除读者
    @DeleteMapping("/delete")
    public R delete(@RequestBody Readers readers) {
        readers.setDelFlag("-1");
        return new R(readersService.updateById(readers));
    }
}

