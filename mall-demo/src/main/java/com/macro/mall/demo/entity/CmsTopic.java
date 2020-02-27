package com.macro.mall.demo.entity;

import java.util.Date;
import java.io.Serializable;
import lombok.Data;
/**
 * 话题表(CmsTopic)实体类
 *
 * @author wyy
 * @since 2020-02-27 13:09:37
 */
@Data
public class CmsTopic implements Serializable {
    private static final long serialVersionUID = 874943500295026957L;
    
    private Long id;
    
    private Long categoryId;
    
    private String name;
    
    private Date createTime;
    
    private Date startTime;
    
    private Date endTime;
    /**
    * 参与人数
    */
    private Integer attendCount;
    /**
    * 关注人数
    */
    private Integer attentionCount;
    
    private Integer readCount;
    /**
    * 奖品名称
    */
    private String awardName;
    /**
    * 参与方式
    */
    private String attendType;
    /**
    * 话题内容
    */
    private String content;


}