package com.zutassociation.system.service.impl;

import com.zutassociation.system.domain.News;
import com.zutassociation.system.mapper.NewsMapper;
import com.zutassociation.system.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 新闻 服务层实现
 *
 * @author 黄玉东
 * @version 1.0
 * @date 2021/2/25 17:51
 */
@Service
public class NewsServiceImpl implements NewsService {

    @Autowired
    private NewsMapper newsMapper;

    /**
     * 查询新闻信息
     *
     * @param newsId 新闻ID
     * @return 新闻信息
     */
    @Override
    public News selectNewsById(Long newsId) {
        return newsMapper.selectNewsById(newsId);
    }

    /**
     * 查询新闻列表
     *
     * @param news 新闻信息
     * @return 新闻集合
     */
    @Override
    public List<News> selectNewsList(News news) {
        return newsMapper.selectNewsList(news);
    }

    /**
     * 新增新闻
     *
     * @param news 新闻信息
     * @return 结果
     */
    @Override
    public int insertNews(News news) {
        return newsMapper.insertNews(news);
    }

    /**
     * 修改新闻
     *
     * @param news 新闻信息
     * @return 结果
     */
    @Override
    public int updateNews(News news) {
        return newsMapper.updateNews(news);
    }

    /**
     * 删除新闻信息
     *
     * @param newsId 新闻ID
     * @return 结果
     */
    @Override
    public int deleteNewsById(Long newsId) {
        return newsMapper.deleteNewsById(newsId);
    }

    /**
     * 批量删除新闻信息
     *
     * @param newsIds 需要删除的新闻ID
     * @return 结果
     */
    @Override
    public int deleteNewsByIds(Long[] newsIds) {
        return newsMapper.deleteNewsByIds(newsIds);
    }
}
