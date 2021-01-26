package com.zutassociation.system.mapper;

import java.util.List;

import com.zutassociation.system.domain.SysNews;

/**
 * 新闻表 数据层
 *
 * @author 黄玉东
 */
public interface SysNewsMapper {
    /**
     * 查询新闻信息
     *
     * @param newsId 新闻ID
     * @return 新闻信息
     */
    public SysNews selectNewsById(Long newsId);

    /**
     * 查询新闻列表
     *
     * @param news 新闻信息
     * @return 新闻集合
     */
    public List<SysNews> selectNewsList(SysNews news);

    /**
     * 新增新闻
     *
     * @param news 新闻信息
     * @return 结果
     */
    public int insertNews(SysNews news);

    /**
     * 修改新闻
     *
     * @param news 新闻信息
     * @return 结果
     */
    public int updateNews(SysNews news);

    /**
     * 批量删除新闻
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
