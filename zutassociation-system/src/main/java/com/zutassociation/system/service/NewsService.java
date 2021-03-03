package com.zutassociation.system.service;



import com.zutassociation.system.domain.News;

import java.util.List;

/**
 * 新闻 服务层
 *
 * @author 黄玉东
 * @version 1.0
 * @date 2021/2/25 17:48
 */
public interface NewsService {

    /**
     * 查询新闻信息
     *
     * @param newsId 新闻ID
     * @return 新闻信息
     */
    public News selectNewsById(Long newsId);

    /**
     * 查询新闻列表
     *
     * @param news 新闻信息
     * @return 新闻集合
     */
    public List<News> selectNewsList(News news);

    /**
     * 新增新闻
     *
     * @param news 新闻信息
     * @return 结果
     */
    public int insertNews(News news);

    /**
     * 修改新闻
     *
     * @param news 新闻信息
     * @return 结果
     */
    public int updateNews(News news);

    /**
     * 删除新闻信息
     *
     * @param newsId 新闻ID
     * @return 结果
     */
    public int deleteNewsById(Long newsId);

    /**
     * 批量删除新闻信息
     *
     * @param newsIds 需要删除的新闻ID
     * @return 结果
     */
    public int deleteNewsByIds(Long[] newsIds);
}
