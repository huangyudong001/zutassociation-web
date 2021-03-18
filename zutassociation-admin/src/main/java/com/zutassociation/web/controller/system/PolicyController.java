package com.zutassociation.web.controller.system;

import com.zutassociation.common.core.controller.BaseController;
import com.zutassociation.common.core.domain.AjaxResult;
import com.zutassociation.common.core.page.TableDataInfo;
import com.zutassociation.common.utils.SecurityUtils;
import com.zutassociation.system.domain.Policy;
import com.zutassociation.system.service.PolicyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 政策法规 信息操作处理
 *
 * @author 黄玉东
 * @version 1.0
 * @date 2021/3/18 17:30
 */

@RestController
@RequestMapping("/policy")
public class PolicyController extends BaseController {

    @Autowired
    private PolicyService policyService;


    /**
     * 获取政策法规列表
     */
    @GetMapping("/list")
    public TableDataInfo list(Policy policy) {
        startPage();
        List<Policy> list = policyService.selectPolicyList(policy);
        return getDataTable(list);
    }

    /**
     * 根据政策法规编号获取详细信息
     */
    @GetMapping(value = "/{policyId}")
    public AjaxResult getInfo(@PathVariable("policyId") Long policyId) {
        return AjaxResult.success(policyService.selectPolicyById(policyId));
    }

    /**
     * 新增政策法规
     */
    @PostMapping
    public AjaxResult add(@Validated @RequestBody Policy policy) {
        policy.setCreateBy(SecurityUtils.getUsername());
        return toAjax(policyService.insertPolicy(policy));
    }

    /**
     * 修改政策法规
     */
    @PutMapping
    public AjaxResult edit(@Validated @RequestBody Policy policy) {
        policy.setUpdateBy(SecurityUtils.getUsername());
        return toAjax(policyService.updatePolicy(policy));
    }

    /**
     * 删除政策法规
     */
    @DeleteMapping("/{policyIds}")
    public AjaxResult remove(@PathVariable Long[] policyIds) {
        return toAjax(policyService.deletePolicyByIds(policyIds));
    }

}
