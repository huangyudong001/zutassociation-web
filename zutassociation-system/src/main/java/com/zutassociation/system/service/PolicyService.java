package com.zutassociation.system.service;



import com.zutassociation.system.domain.Policy;

import java.util.List;

/**
 * 政策法规 服务层
 *
 * @author 黄玉东
 * @version 1.0
 * @date 2021/3/18 17:05
 */
public interface PolicyService {

    /**
     * 查询政策法规信息
     *
     * @param policyId 政策法规ID
     * @return 政策法规信息
     */
    public Policy selectPolicyById(Long policyId);

    /**
     * 查询政策法规列表
     *
     * @param policy 政策法规信息
     * @return 政策法规集合
     */
    public List<Policy> selectPolicyList(Policy policy);

    /**
     * 新增政策法规
     *
     * @param policy 政策法规信息
     * @return 结果
     */
    public int insertPolicy(Policy policy);

    /**
     * 修改政策法规
     *
     * @param policy 政策法规信息
     * @return 结果
     */
    public int updatePolicy(Policy policy);

    /**
     * 删除政策法规信息
     *
     * @param policyId 政策法规ID
     * @return 结果
     */
    public int deletePolicyById(Long policyId);

    /**
     * 批量删除政策法规信息
     *
     * @param policyIds 需要删除的政策法规ID
     * @return 结果
     */
    public int deletePolicyByIds(Long[] policyIds);
}
