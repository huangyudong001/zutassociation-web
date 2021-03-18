package com.zutassociation.system.service.impl;

import com.zutassociation.system.domain.Policy;
import com.zutassociation.system.mapper.PolicyMapper;
import com.zutassociation.system.service.PolicyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 政策法规 服务层实现
 *
 * @author 黄玉东
 * @version 1.0
 * @date 2021/3/18 17:15
 */
@Service
public class PolicyServiceImpl implements PolicyService {

    @Autowired
    private PolicyMapper policyMapper;

    /**
     * 查询政策法规信息
     *
     * @param policyId 政策法规ID
     * @return 政策法规信息
     */
    @Override
    public Policy selectPolicyById(Long policyId) {
        return policyMapper.selectPolicyById(policyId);
    }

    /**
     * 查询政策法规列表
     *
     * @param policy 政策法规信息
     * @return 政策法规集合
     */
    @Override
    public List<Policy> selectPolicyList(Policy policy) {
        return policyMapper.selectPolicyList(policy);
    }

    /**
     * 新增政策法规
     *
     * @param policy 政策法规信息
     * @return 结果
     */
    @Override
    public int insertPolicy(Policy policy) {
        return policyMapper.insertPolicy(policy);
    }

    /**
     * 修改政策法规
     *
     * @param policy 政策法规信息
     * @return 结果
     */
    @Override
    public int updatePolicy(Policy policy) {
        return policyMapper.updatePolicy(policy);
    }

    /**
     * 删除政策法规信息
     *
     * @param policyId 政策法规ID
     * @return 结果
     */
    @Override
    public int deletePolicyById(Long policyId) {
        return policyMapper.deletePolicyById(policyId);
    }

    /**
     * 批量删除政策法规信息
     *
     * @param policyIds 需要删除的政策法规ID
     * @return 结果
     */
    @Override
    public int deletePolicyByIds(Long[] policyIds) {
        return policyMapper.deletePolicyByIds(policyIds);
    }
}
