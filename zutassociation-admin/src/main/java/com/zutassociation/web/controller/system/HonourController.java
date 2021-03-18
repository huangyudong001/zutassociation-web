package com.zutassociation.web.controller.system;

import com.zutassociation.common.core.controller.BaseController;
import com.zutassociation.common.core.domain.AjaxResult;
import com.zutassociation.common.core.page.TableDataInfo;
import com.zutassociation.common.utils.SecurityUtils;
import com.zutassociation.system.domain.Honour;
import com.zutassociation.system.service.HonourService;
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
@RequestMapping("/honour")
public class HonourController extends BaseController {

    @Autowired
    private HonourService honourService;


    /**
     * 获取政策法规列表
     */
    @GetMapping("/list")
    public TableDataInfo list(Honour honour) {
        startPage();
        List<Honour> list = honourService.selectHonourList(honour);
        return getDataTable(list);
    }

    /**
     * 根据政策法规编号获取详细信息
     */
    @GetMapping(value = "/{honourId}")
    public AjaxResult getInfo(@PathVariable("honourId") Long honourId) {
        return AjaxResult.success(honourService.selectHonourById(honourId));
    }

    /**
     * 新增政策法规
     */
    @PostMapping
    public AjaxResult add(@Validated @RequestBody Honour honour) {
        honour.setCreateBy(SecurityUtils.getUsername());
        return toAjax(honourService.insertHonour(honour));
    }

    /**
     * 修改政策法规
     */
    @PutMapping
    public AjaxResult edit(@Validated @RequestBody Honour honour) {
        honour.setUpdateBy(SecurityUtils.getUsername());
        return toAjax(honourService.updateHonour(honour));
    }

    /**
     * 删除政策法规
     */
    @DeleteMapping("/{honourIds}")
    public AjaxResult remove(@PathVariable Long[] honourIds) {
        return toAjax(honourService.deleteHonourByIds(honourIds));
    }

}
