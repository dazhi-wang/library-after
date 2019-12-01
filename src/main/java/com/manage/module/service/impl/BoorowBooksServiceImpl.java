package com.manage.module.service.impl;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.manage.module.entity.BoorowBooks;
import com.manage.module.mapper.BoorowBooksMapper;
import com.manage.module.service.BoorowBooksService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * 借书表 服务实现类
 * </p>
 *
 * @author liujiajia
 * @since 2019-11-11
 */
@Service
public class BoorowBooksServiceImpl extends ServiceImpl<BoorowBooksMapper, BoorowBooks> implements BoorowBooksService {

    // 管理图书表查询借书列表
    @Override
    public Page<Map<String,Object>> queryBoorowBooks(Page page, BoorowBooks boorowBooks) {
        return baseMapper.queryBoorowBooks(page,boorowBooks);
    }
}
