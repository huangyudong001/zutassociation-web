package com.zutassociation.system.domain;

import com.zutassociation.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

/**
 * 光荣榜表 honour
 *
 * @author 黄玉东
 * @version 1.0
 * @date 2021/3/18 19:55
 */
public class Honour extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 光荣榜ID
     */
    private Long honourId;

    /**
     * 光荣榜标题
     */
    private String honourTitle;

    /**
     * 光荣榜内容
     */
    private String honourContent;

    /**
     * 光荣榜状态（0正常 1关闭）
     */
    private String status;

    /**
     * 光荣榜点击量
     */
    private Long click;

    public Long getHonourId() {
        return honourId;
    }

    public void setHonourId(Long honourId) {
        this.honourId = honourId;
    }

    @NotBlank(message = "政策法规标题不能为空")
    @Size(min = 0, max = 50, message = "政策法规标题不能超过50个字符")
    public String getHonourTitle() {
        return honourTitle;
    }

    public void setHonourTitle(String honourTitle) {
        this.honourTitle = honourTitle;
    }

    public String getHonourContent() {
        return honourContent;
    }

    public void setHonourContent(String honourContent) {
        this.honourContent = honourContent;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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
                .append("honourId", getHonourId())
                .append("honourTitle", getHonourTitle())
                .append("honourContent", getHonourContent())
                .append("status", getStatus())
                .append("createBy", getCreateBy())
                .append("createTime", getCreateTime())
                .append("updateBy", getUpdateBy())
                .append("updateTime", getUpdateTime())
                .append("remark", getRemark())
                .append("click", getClick())
                .toString();
    }
}
