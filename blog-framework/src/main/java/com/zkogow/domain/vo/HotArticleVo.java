package com.zkogow.domain.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Description:
 * @Author: WainZeng
 * @Date: 2024/9/22 12:36
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class HotArticleVo {
    //ID
    private Long id;
    //文章标题
    private String title;
    //访问量
    private Long viewCount;
}
