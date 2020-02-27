package com.macro.mall.demo.dao;

import com.macro.mall.demo.entity.CmsTopic;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
/**
 * 话题表(CmsTopic)表数据库访问层
 *
 * @author wyy
 * @since 2020-02-27 13:09:37
 */
@Mapper
public interface CmsTopicDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    CmsTopic queryById(Long id);

    /**
     * 分页查询，查询指定行数据
     *
     * @param pageNum 查询起始位置
     * @param pageSize 查询条数
     * @return 对象列表
     */
    List<CmsTopic> pageAll(@Param("pageNum") int pageNum, @Param("pageSize") int pageSize);
    
    /**
     * 根据条件分页查询，查询指定行数据
     *
     * @param pageNum 查询起始位置
     * @param pageSize 查询条数
     * @return 对象列表
     */
    List<CmsTopic> pageByCmsTopic(@Param("cmsTopic") CmsTopic cmsTopic, @Param("pageNum") int pageNum, @Param("pageSize") int pageSize);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param cmsTopic 实例对象
     * @return 对象列表
     */
    List<CmsTopic> queryByCmsTopic(CmsTopic cmsTopic);

    /**
     * 新增数据
     *
     * @param cmsTopic 实例对象
     * @return 影响行数
     */
    int insert(CmsTopic cmsTopic);

    /**
     * 修改数据
     *
     * @param cmsTopic 实例对象
     * @return 影响行数
     */
    int update(CmsTopic cmsTopic);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);

}