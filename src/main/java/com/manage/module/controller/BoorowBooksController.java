package com.manage.module.controller;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.manage.module.entity.BoorowBooks;
import com.manage.module.entity.Readers;
import com.manage.module.entity.User;
import com.manage.module.service.BoorowBooksService;
import com.manage.utils.R;
import com.manage.utils.RequestSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    // 借书
    @PostMapping("/save")
    public R save(@RequestBody BoorowBooks boorowBooks) {
        RequestSession<User> requestSession = new RequestSession<>();
       boorowBooks.setCreateId(requestSession.getUser().getId());
       boorowBooks.setCreateName( requestSession.getUser().getHolder());
        return new R(boorowBooksService.save(boorowBooks));
    }
}

