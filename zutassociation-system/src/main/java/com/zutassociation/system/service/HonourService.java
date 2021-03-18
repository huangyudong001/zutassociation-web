package com.zutassociation.system.service;



import com.zutassociation.system.domain.Honour;

import java.util.List;

/**
 * 光荣榜 服务层
 *
 * @author 黄玉东
 * @version 1.0
 * @date 2021/3/18 17:05
 */
public interface HonourService {

    /**
     * 查询光荣榜信息
     *
     * @param honourId 光荣榜ID
     * @return 光荣榜信息
     */
    public Honour selectHonourById(Long honourId);

    /**
     * 查询光荣榜列表
     *
     * @param honour 光荣榜信息
     * @return 光荣榜集合
     */
    public List<Honour> selectHonourList(Honour honour);

    /**
     * 新增光荣榜
     *
     * @param honour 光荣榜信息
     * @return 结果
     */
    public int insertHonour(Honour honour);

    /**
     * 修改光荣榜
     *
     * @param honour 光荣榜信息
     * @return 结果
     */
    public int updateHonour(Honour honour);

    /**
     * 删除光荣榜信息
     *
     * @param honourId 光荣榜ID
     * @return 结果
     */
    public int deleteHonourById(Long honourId);

    /**
     * 批量删除光荣榜信息
     *
     * @param honourIds 需要删除的光荣榜ID
     * @return 结果
     */
    public int deleteHonourByIds(Long[] honourIds);
}
