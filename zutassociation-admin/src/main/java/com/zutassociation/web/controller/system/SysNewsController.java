package com.zutassociation.web.controller.system;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.zutassociation.common.annotation.Log;
import com.zutassociation.common.core.controller.BaseController;
import com.zutassociation.common.core.domain.AjaxResult;
import com.zutassociation.common.core.page.TableDataInfo;
import com.zutassociation.common.enums.BusinessType;
import com.zutassociation.common.utils.SecurityUtils;
import com.zutassociation.system.domain.SysNews;
import com.zutassociation.system.service.ISysNewsService;

/**
 * 新闻 信息操作处理
 *
 * @author 黄玉东
 */
@RestController
@RequestMapping("/system/news")
public class SysNewsController extends BaseController
{
    @Autowired
    private ISysNewsService newsService;

    /**
     * 获取新闻列表
     */
    @PreAuthorize("@ss.hasPermi('system:news:list')")
    @GetMapping("/list")
    public TableDataInfo list(SysNews news)
    {
        startPage();
        List<SysNews> list = newsService.selectNewsList(news);
        return getDataTable(list);
    }

    /**
     * 根据新闻编号获取详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:News:query')")
    @GetMapping(value = "/{newsId}")
    public AjaxResult getInfo(@PathVariable Long newsId)
    {
        return AjaxResult.success(newsService.selectNewsById(newsId));
    }

    /**
     * 新增新闻
     */
    @PreAuthorize("@ss.hasPermi('system:news:add')")
    @Log(title = "新闻", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@Validated @RequestBody SysNews news)
    {
        news.setCreateBy(SecurityUtils.getUsername());
        return toAjax(newsService.insertNews(news));
    }

    /**
     * 修改新闻
     */
    @PreAuthorize("@ss.hasPermi('system:news:edit')")
    @Log(title = "新闻", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@Validated @RequestBody SysNews news)
    {
        news.setUpdateBy(SecurityUtils.getUsername());
        return toAjax(newsService.updateNews(news));
    }

    /**
     * 删除新闻
     */
    @PreAuthorize("@ss.hasPermi('system:news:remove')")
    @Log(title = "新闻", businessType = BusinessType.DELETE)
    @DeleteMapping("/{newsIds}")
    public AjaxResult remove(@PathVariable Long[] newsIds)
    {
        return toAjax(newsService.deleteNewsByIds(newsIds));
    }
}
