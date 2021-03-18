package com.zutassociation.system.domain;

import com.zutassociation.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

/**
 * 政策法规表 policy
 *
 * @author 黄玉东
 * @version 1.0
 * @date 2021/3/18 15:27
 */
public class Policy extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 政策法规ID
     */
    private Long policyId;

    /**
     * 政策法规标题
     */
    private String policyTitle;

    /**
     * 政策法规内容
     */
    private String policyContent;

    /**
     * 政策法规状态（0正常 1关闭）
     */
    private String status;

    /**
     * 政策法规点击量
     */
    private Long click;

    public Long getPolicyId() {
        return policyId;
    }

    public void setPolicyId(Long policyId) {
        this.policyId = policyId;
    }

    @NotBlank(message = "政策法规标题不能为空")
    @Size(min = 0, max = 50, message = "政策法规标题不能超过50个字符")
    public String getPolicyTitle() {
        return policyTitle;
    }

    public void setPolicyTitle(String policyTitle) {
        this.policyTitle = policyTitle;
    }

    public String getPolicyContent() {
        return policyContent;
    }

    public void setPolicyContent(String policyContent) {
        this.policyContent = policyContent;
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
                .append("policyId", getPolicyId())
                .append("policyTitle", getPolicyTitle())
                .append("policyContent", getPolicyContent())
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
