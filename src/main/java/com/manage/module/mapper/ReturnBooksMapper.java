package com.manage.module.mapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.manage.module.entity.ReturnBooks;

import java.util.Map;

/**
 * <p>
 * 还书表 Mapper 接口
 * </p>
 *
 * @author liujiajia
 * @since 2019-11-11
 */
public interface ReturnBooksMapper extends BaseMapper<ReturnBooks> {

    // 关联图书表查询还书列表
    Page<Map<String,Object>> queryReturnBooks(Page page, ReturnBooks returnBooks);
}
