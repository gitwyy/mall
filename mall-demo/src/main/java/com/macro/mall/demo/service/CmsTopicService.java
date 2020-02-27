package com.macro.mall.demo.service;

import com.macro.mall.demo.entity.CmsTopic;
import java.util.List;

/**
 * 话题表(CmsTopic)表服务接口
 *
 * @author wyy
 * @since 2020-02-27 13:09:37
 */
public interface CmsTopicService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    CmsTopic queryById(Long id);

    /**
     * 分页查询，查询多条数据
     *
     * @param pageNum 查询起始位置
     * @param pageSize 查询条数
     * @return 对象列表
     */
    List<CmsTopic> pageAll(int pageNum, int pageSize);
    
    /**
     * 根据条件分页查询，查询多条数据
     *
     * @param pageNum 查询起始位置
     * @param pageSize 查询条数
     * @return 对象列表
     */
    List<CmsTopic> pageByCmsTopic(CmsTopic cmsTopic, int pageNum, int pageSize);

    /**
     * 新增数据
     *
     * @param cmsTopic 实例对象
     * @return 实例对象
     */
    CmsTopic insert(CmsTopic cmsTopic);

    /**
     * 修改数据
     *
     * @param cmsTopic 实例对象
     * @return 实例对象
     */
    CmsTopic update(CmsTopic cmsTopic);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}