package com.zutassociation.system.service.impl;

import com.zutassociation.system.domain.Honour;
import com.zutassociation.system.mapper.HonourMapper;
import com.zutassociation.system.service.HonourService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 光荣榜 服务层实现
 *
 * @author 黄玉东
 * @version 1.0
 * @date 2021/3/18 17:15
 */
@Service
public class HonourServiceImpl implements HonourService {

    @Autowired
    private HonourMapper honourMapper;

    /**
     * 查询光荣榜信息
     *
     * @param honourId 光荣榜ID
     * @return 光荣榜信息
     */
    @Override
    public Honour selectHonourById(Long honourId) {
        return honourMapper.selectHonourById(honourId);
    }

    /**
     * 查询光荣榜列表
     *
     * @param honour 光荣榜信息
     * @return 光荣榜集合
     */
    @Override
    public List<Honour> selectHonourList(Honour honour) {
        return honourMapper.selectHonourList(honour);
    }

    /**
     * 新增光荣榜
     *
     * @param honour 光荣榜信息
     * @return 结果
     */
    @Override
    public int insertHonour(Honour honour) {
        return honourMapper.insertHonour(honour);
    }

    /**
     * 修改光荣榜
     *
     * @param honour 光荣榜信息
     * @return 结果
     */
    @Override
    public int updateHonour(Honour honour) {
        return honourMapper.updateHonour(honour);
    }

    /**
     * 删除光荣榜信息
     *
     * @param honourId 光荣榜ID
     * @return 结果
     */
    @Override
    public int deleteHonourById(Long honourId) {
        return honourMapper.deleteHonourById(honourId);
    }

    /**
     * 批量删除光荣榜信息
     *
     * @param honourIds 需要删除的光荣榜ID
     * @return 结果
     */
    @Override
    public int deleteHonourByIds(Long[] honourIds) {
        return honourMapper.deleteHonourByIds(honourIds);
    }
}
