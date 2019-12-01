package com.manage.module.controller;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.manage.module.entity.Books;
import com.manage.module.service.BooksService;
import com.manage.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 * 图书表 前端控制器
 * </p>
 *
 * @author liujiajia
 * @since 2019-11-11
 */
@RestController
@RequestMapping("/books")
public class BooksController {
    @Autowired
    private BooksService booksService;

    // 分页查询图书列表
    @GetMapping("/page")
    public R page(Page page, Books books) {
        return new R(booksService.page(page, Wrappers.lambdaQuery(books).eq(Books::getDelFlag,"0")));
    }

    // 新增图书
    @PostMapping("/save")
    public R save(@RequestBody Books books) {
        return new R(booksService.save(books));
    }

    // 修改图书
    @PutMapping("/update")
    public R update(@RequestBody Books books) {
        return new R(booksService.updateById(books));
    }

    // 删除图书
    @DeleteMapping("/delete")
    public R delete(@RequestBody Books books) {
        books.setDelFlag("-1");
        return new R(booksService.updateById(books));
    }

}

