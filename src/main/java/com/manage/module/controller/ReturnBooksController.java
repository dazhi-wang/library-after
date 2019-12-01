package com.manage.module.controller;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.manage.module.entity.ReturnBooks;
import com.manage.module.service.ReturnBooksService;
import com.manage.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    // 分页查询还书列表
    @GetMapping("/page")
    public R page(Page page, ReturnBooks returnBooks) {
        return new R(returnBooksService.queryReturnBooks(page, returnBooks));
    }
}

