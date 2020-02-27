package com.macro.mall.demo.controller;

import com.github.pagehelper.PageInfo;
import com.macro.mall.demo.MallDemoApplication;
import com.macro.mall.demo.entity.CmsTopic;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = MallDemoApplication.class)
public class CmsTopicControllerTest {

    @Autowired
    private CmsTopicController cmsTopicController;

    @Test
    public void selectOne() {
        CmsTopic cmsTopic = cmsTopicController.selectOne(1L);

        System.out.println("selectOne ???????????????" + cmsTopic);
    }

    @Test
    public void pageAll() {
        List<CmsTopic> cmsTopics = cmsTopicController.pageAll(1, 10);

        System.out.println("pageAll ???????????????" + cmsTopics);
    }

    @Test
    public void pageByCmsTopic() {
        List<CmsTopic> cmsTopics = cmsTopicController.pageByCmsTopic(new CmsTopic(), 1, 10);

        System.out.println("pageByCmsTopic ???????????????" + cmsTopics);
    }
}