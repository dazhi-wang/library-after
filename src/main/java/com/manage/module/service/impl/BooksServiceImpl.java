package com.manage.module.service.impl;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.manage.module.entity.Books;
import com.manage.module.mapper.BooksMapper;
import com.manage.module.service.BooksService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 图书表 服务实现类
 * </p>
 *
 * @author liujiajia
 * @since 2019-11-11
 */
@Service
public class BooksServiceImpl extends ServiceImpl<BooksMapper, Books> implements BooksService {

}
