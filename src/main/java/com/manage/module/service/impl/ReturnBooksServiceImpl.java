package com.manage.module.service.impl;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.manage.module.entity.ReturnBooks;
import com.manage.module.mapper.ReturnBooksMapper;
import com.manage.module.service.ReturnBooksService;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * <p>
 * 还书表 服务实现类
 * </p>
 *
 * @author liujiajia
 * @since 2019-11-11
 */
@Service
public class ReturnBooksServiceImpl extends ServiceImpl<ReturnBooksMapper, ReturnBooks> implements ReturnBooksService {

    // 关联图书表查询还书列表
    @Override
    public Page<Map<String,Object>> queryReturnBooks(Page page, ReturnBooks returnBooks) {
        return baseMapper.queryReturnBooks(page,returnBooks);
    }
}
