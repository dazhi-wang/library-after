package com.manage.module.service;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.manage.module.entity.BoorowBooks;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * 借书表 服务类
 * </p>
 *
 * @author liujiajia
 * @since 2019-11-11
 */
public interface BoorowBooksService extends IService<BoorowBooks> {
    // 管理图书表查询借书列表
    Page<Map<String,Object>> queryBoorowBooks(Page page,BoorowBooks boorowBooks);
}
