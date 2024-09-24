package com.zkogow.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zkogow.constants.SystemConstants;
import com.zkogow.domain.ResponseResult;
import com.zkogow.domain.entity.Article;
import com.zkogow.domain.vo.HotArticleVo;
import com.zkogow.mapper.ArticleMapper;
import com.zkogow.service.ArticleService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 * @Author: WainZeng
 * @Date: 2024/9/21 19:45
 */

@Service
public class ArticleServiceImpl extends ServiceImpl<ArticleMapper, Article> implements ArticleService {

    @Override
    public ResponseResult hotArticleList() {
        //查询热门文章 封装成ResponseResult返回

        LambdaQueryWrapper<Article> queryWrapper = new LambdaQueryWrapper<>();
        //必须是正式文章
        queryWrapper.eq(Article::getStatus, SystemConstants.ARTICLE_STATUS_NORMAL);
        //按照浏览量进行排序
        queryWrapper.orderByDesc(Article::getViewCount);
        //最多查询出10条记录
        Page<Article> page = new Page(1, 10);
        page(page, queryWrapper);

        List<Article> articles = page.getRecords();

        //bean拷贝
        List<HotArticleVo> articleVos = new ArrayList<>();
        for (Article article : articles) {
            HotArticleVo vo = new HotArticleVo();
            BeanUtils.copyProperties(article, vo);
            articleVos.add(vo);
        }

        return ResponseResult.okResult(articleVos);
    }
}
