package com.macro.mall.demo.controller;

import com.macro.mall.demo.entity.CmsTopic;
import com.macro.mall.demo.service.CmsTopicService;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import javax.annotation.Resource;

/**
 * 话题表(CmsTopic)表控制层
 *
 * @author wyy
 * @since 2020-02-27 13:09:37
 */
@RestController
@RequestMapping("cmsTopic")
public class CmsTopicController {
    /**
     * 服务对象
     */
    @Resource
    private CmsTopicService cmsTopicService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public CmsTopic selectOne(Long id) {
        return cmsTopicService.queryById(id);
    }

    /**
     * 分页查询，根据页码查询所有数据
     *
     * @param pageNum 开始页码
     * @param pageSize 分页步长
     * @return 分页数据
     */
    @GetMapping("pageAll")
    public List<CmsTopic> pageAll(@RequestParam("pageNum") int pageNum,@RequestParam("pageSize") int pageSize) {
        return cmsTopicService.pageAll(pageNum, pageSize);
    }

    /**
     * 根据条件分页查询
     *
     * @param pageNum 开始页码
     * @param pageSize 分页步长
     * @return 分页数据
     */
    @PostMapping("pageByCmsTopic")
    public List<CmsTopic> pageByCmsTopic(CmsTopic cmsTopic, int pageNum, int pageSize) {
        return cmsTopicService.pageByCmsTopic(cmsTopic, pageNum, pageSize);
    }
}