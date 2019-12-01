package com.manage.module.mapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.manage.module.entity.BoorowBooks;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * 借书表 Mapper 接口
 * </p>
 *
 * @author liujiajia
 * @since 2019-11-11
 */
public interface BoorowBooksMapper extends BaseMapper<BoorowBooks> {
    // 管理图书表查询借书列表
    Page<Map<String,Object>> queryBoorowBooks(Page page, BoorowBooks boorowBooks);
}
