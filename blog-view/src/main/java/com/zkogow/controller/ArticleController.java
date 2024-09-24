package com.zkogow.controller;

import com.zkogow.domain.ResponseResult;
import com.zkogow.domain.entity.Article;
import com.zkogow.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Description:
 * @Author: WainZeng
 * @Date: 2024/9/21 19:51
 */

@RestController
@RequestMapping("/article")
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    @GetMapping("/hotArticleList")
    public ResponseResult hotArticleList() {

        ResponseResult result =  articleService.hotArticleList();
        return result;
    }

    //@GetMapping("/list")
    //public List<Article> test() {
    //return articleService.list();
    //}
}
