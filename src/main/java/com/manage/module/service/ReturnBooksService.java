package com.manage.module.service;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.manage.module.entity.ReturnBooks;

import java.util.Map;

/**
 * <p>
 * 还书表 服务类
 * </p>
 *
 * @author liujiajia
 * @since 2019-11-11
 */
public interface ReturnBooksService extends IService<ReturnBooks> {
    // 关联图书表查询还书列表
    Page<Map<String,Object>> queryReturnBooks(Page page,ReturnBooks returnBooks);
}
