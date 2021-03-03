package com.zutassociation.system.domain;


import com.zutassociation.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

/**
 * 新闻表 news
 *
 * @author 黄玉东
 * @version 1.0
 * @date 2021/2/25 15:40
 */
public class News extends BaseEntity {

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

    /**
     * 新闻点击量
     */
    private Long click;

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

    public Long getClick() {
        return click;
    }

    public void setClick(Long click) {
        this.click = click;
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
                .append("click",getClick())
                .toString();
    }
}
