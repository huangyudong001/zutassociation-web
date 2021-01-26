package com.zutassociation.system.service.impl;

import java.util.List;

import com.zutassociation.system.domain.SysNews;
import com.zutassociation.system.mapper.SysNewsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.zutassociation.system.service.ISysNewsService;

/**
 * 新闻 服务层实现
 *
 * @author 黄玉东
 */
@Service
public class SysNewsServiceImpl implements ISysNewsService {
    @Autowired
    private SysNewsMapper newsMapper;

    /**
     * 查询新闻信息
     *
     * @param newsId 新闻ID
     * @return 新闻信息
     */
    @Override
    public SysNews selectNewsById(Long newsId) {
        return newsMapper.selectNewsById(newsId);
    }

    /**
     * 查询新闻列表
     *
     * @param news 新闻信息
     * @return 新闻集合
     */
    @Override
    public List<SysNews> selectNewsList(SysNews news) {
        return newsMapper.selectNewsList(news);
    }

    /**
     * 新增新闻
     *
     * @param news 新闻信息
     * @return 结果
     */
    @Override
    public int insertNews(SysNews news) {
        return newsMapper.insertNews(news);
    }

    /**
     * 修改新闻
     *
     * @param news 新闻信息
     * @return 结果
     */
    @Override
    public int updateNews(SysNews news) {
        return newsMapper.updateNews(news);
    }

    /**
     * 删除新闻对象
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
