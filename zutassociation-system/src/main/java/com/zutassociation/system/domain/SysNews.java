package com.zutassociation.system.domain;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.zutassociation.common.core.domain.BaseEntity;

/**
 * 新闻表 sys_news
 *
 * @author 黄玉东
 */
public class SysNews extends BaseEntity {
    private static final long serialVersionUID = 1L;

    /**
     * 新闻ID
     */
    private Long newsId;

    /**
     * 新闻标题
     */
    private String newsTitle;

    /**
     * 新闻内容
     */
    private String newsContent;

    /**
     * 新闻状态（0正常 1关闭）
     */
    private String status;

    public Long getNewsId() {
        return newsId;
    }

    public void setNewsId(Long newsId) {
        this.newsId = newsId;
    }

    public void setNewsTitle(String newsTitle) {
        this.newsTitle = newsTitle;
    }

    @NotBlank(message = "新闻标题不能为空")
    @Size(min = 0, max = 50, message = "新闻标题不能超过50个字符")
    public String getNewsTitle() {
        return newsTitle;
    }

    public void setNewsContent(String newsContent) {
        this.newsContent = newsContent;
    }

    public String getNewsContent() {
        return newsContent;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                .append("newsId", getNewsId())
                .append("newsTitle", getNewsTitle())
                .append("newsContent", getNewsContent())
                .append("status", getStatus())
                .append("createBy", getCreateBy())
                .append("createTime", getCreateTime())
                .append("updateBy", getUpdateBy())
                .append("updateTime", getUpdateTime())
                .append("remark", getRemark())
                .toString();
    }
}
