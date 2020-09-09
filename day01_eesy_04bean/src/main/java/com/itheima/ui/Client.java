package com.itheima.ui;

import com.itheima.service.IAccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: zhangycl
 * @date: 2020/8/31
 * @description: 模拟一个表现层，用于调用业务层
 */
public class Client {

    public static void main(String[] args) {
        //1.获取核心容器对象
//        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");

        //2.根据id获取Bean对象
        IAccountService as = (IAccountService)ac.getBean("accountService");
        System.out.println(as);
        as.saveAccount();

        IAccountService as1 = (IAccountService)ac.getBean("accountService");
        System.out.println(as1);
        as1.saveAccount();

        //手动关闭容器
        ac.close();
    }
}
