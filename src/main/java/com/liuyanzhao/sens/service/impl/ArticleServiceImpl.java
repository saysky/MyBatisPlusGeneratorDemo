package com.liuyanzhao.sens.service.impl;

import com.liuyanzhao.sens.model.Article;
import com.liuyanzhao.sens.dao.ArticleDao;
import com.liuyanzhao.sens.service.IArticleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author liuyanzhao
 * @since 2021-07-09
 */
@Service
public class ArticleServiceImpl extends ServiceImpl<ArticleDao, Article> implements IArticleService {

}
