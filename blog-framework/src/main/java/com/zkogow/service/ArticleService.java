package com.zkogow.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zkogow.domain.ResponseResult;
import com.zkogow.domain.entity.Article;

/**
 * @Description:
 * @Author: WainZeng
 * @Date: 2024/9/21 19:44
 */

public interface ArticleService extends IService<Article> {
    ResponseResult hotArticleList();
}
