package com.zutassociation.web.controller.system;

import com.zutassociation.common.core.controller.BaseController;
import com.zutassociation.common.core.domain.AjaxResult;
import com.zutassociation.common.core.page.TableDataInfo;
import com.zutassociation.common.utils.SecurityUtils;
import com.zutassociation.system.domain.News;
import com.zutassociation.system.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 新闻 信息操作处理
 *
 * @author 黄玉东
 * @version 1.0
 * @date 2021/2/25 18:03
 */

@RestController
@RequestMapping("/news")
public class NewsController extends BaseController {

    @Autowired
    private NewsService newsService;


    /**
     * 获取新闻列表
     */
    @GetMapping("/list")
    public TableDataInfo list(News news) {
        startPage();
        List<News> list = newsService.selectNewsList(news);
        return getDataTable(list);
    }

    /**
     * 根据新闻编号获取详细信息
     */
    @GetMapping(value = "/{newsId}")
    public AjaxResult getInfo(@PathVariable("newsId") Long newsId) {
        return AjaxResult.success(newsService.selectNewsById(newsId));
    }

    /**
     * 新增新闻
     */
    @PostMapping
    public AjaxResult add(@Validated @RequestBody News news) {
        news.setCreateBy(SecurityUtils.getUsername());
        return toAjax(newsService.insertNews(news));
    }

    /**
     * 修改新闻
     */
    @PutMapping
    public AjaxResult edit(@Validated @RequestBody News news) {
        news.setUpdateBy(SecurityUtils.getUsername());
        return toAjax(newsService.updateNews(news));
    }

    /**
     * 删除新闻
     */
    @DeleteMapping("/{newsIds}")
    public AjaxResult remove(@PathVariable Long[] newsIds) {
        return toAjax(newsService.deleteNewsByIds(newsIds));
    }

}
