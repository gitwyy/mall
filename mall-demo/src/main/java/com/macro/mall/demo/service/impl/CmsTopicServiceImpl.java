package com.macro.mall.demo.service.impl;

import com.macro.mall.demo.entity.CmsTopic;
import com.macro.mall.demo.dao.CmsTopicDao;
import com.macro.mall.demo.service.CmsTopicService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 话题表(CmsTopic)表服务实现类
 *
 * @author wyy
 * @since 2020-02-27 13:09:37
 */
@Service("cmsTopicService")
public class CmsTopicServiceImpl implements CmsTopicService {
    @Resource
    private CmsTopicDao cmsTopicDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public CmsTopic queryById(Long id) {
        return this.cmsTopicDao.queryById(id);
    }

    /**
     * 分页查询，查询多条数据
     *
     * @param pageNum 查询起始位置
     * @param pageSize 查询条数
     * @return 对象列表
     */
    @Override
    public List<CmsTopic> pageAll(int pageNum, int pageSize) {
        return this.cmsTopicDao.pageAll(pageNum, pageSize);
    }

    /**
     * 根据条件分页查询，查询多条数据
     *
     * @param pageNum 查询起始位置
     * @param pageSize 查询条数
     * @return 对象列表
     */
    @Override
    public List<CmsTopic> pageByCmsTopic(CmsTopic cmsTopic, int pageNum, int pageSize) {
        return this.cmsTopicDao.pageByCmsTopic(cmsTopic, pageNum, pageSize);
    }

    /**
     * 新增数据
     *
     * @param cmsTopic 实例对象
     * @return 实例对象
     */
    @Override
    public CmsTopic insert(CmsTopic cmsTopic) {
        this.cmsTopicDao.insert(cmsTopic);
        return cmsTopic;
    }

    /**
     * 修改数据
     *
     * @param cmsTopic 实例对象
     * @return 实例对象
     */
    @Override
    public CmsTopic update(CmsTopic cmsTopic) {
        this.cmsTopicDao.update(cmsTopic);
        return this.queryById(cmsTopic.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.cmsTopicDao.deleteById(id) > 0;
    }
}