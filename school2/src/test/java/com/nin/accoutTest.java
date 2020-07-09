package com.nin;

import com.nin.common.pojo.College;
import com.nin.common.service.imp.CollegeServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * Created by 狼人 on 2020/7/7.
 */
@RunWith(value = SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "/applicationContext.xml")
public class accoutTest {
   @Autowired
    CollegeServiceImpl collegeService;
    @Test
    public void test1(){
        List<College> list = collegeService.getList();
        System.out.println(list);
    }
}
