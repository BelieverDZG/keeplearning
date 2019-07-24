package com.dzg.test;

import com.dzg.service.IAccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

    @Test
    public void testSpring(){
        //加载配置文件
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        //获取对象
        IAccountService as = (IAccountService) ac.getBean("accountService");
        //调用方法
        as.findAll();

    }
}
