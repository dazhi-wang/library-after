package com.manage.module.controller;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.manage.module.entity.BoorowBooks;
import com.manage.module.entity.ReturnBooks;
import com.manage.module.service.BoorowBooksService;
import com.manage.module.service.ReturnBooksService;
import com.manage.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

/**
 * <p>
 * 还书表 前端控制器
 * </p>
 *
 * @author liujiajia
 * @since 2019-11-11
 */
@RestController
@RequestMapping("/returnbooks")
public class ReturnBooksController {
    @Autowired
    private ReturnBooksService returnBooksService;
    @Autowired
    private BoorowBooksService boorowBooksService;

    // 分页查询还书列表
    @GetMapping("/page")
    public R page(Page page, ReturnBooks returnBooks) {
        return new R(returnBooksService.queryReturnBooks(page, returnBooks));
    }

    // 新增还书记录
    @PostMapping("/save")
    public R save(@RequestBody ReturnBooks returnBooks) {
        boorowBooksService.removeById(returnBooks.getBoorowId());
        returnBooks.setReturnTime(LocalDateTime.now());
        return new R(returnBooksService.save(returnBooks));
    }
}

