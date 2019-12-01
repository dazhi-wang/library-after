package com.manage.module.controller;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.manage.module.entity.BoorowBooks;
import com.manage.module.entity.Readers;
import com.manage.module.service.BoorowBooksService;
import com.manage.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 借书表 前端控制器
 * </p>
 *
 * @author liujiajia
 * @since 2019-11-11
 */
@RestController
@RequestMapping("/boorowbooks")
public class BoorowBooksController {
    @Autowired
    private BoorowBooksService boorowBooksService;
    // 分页查询借书列表
    @GetMapping("/page")
    public R page(Page page, BoorowBooks boorowBooks) {
        return new R(boorowBooksService.queryBoorowBooks(page, boorowBooks));
    }
}

