package com.itheima.ui;

import com.itheima.service.IAccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: zhangycl
 * @date: 2020/8/31
 * @description:
 */
public class Client {
    public static void main(String[] args) {

        //1.获取核心容器对象
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        //2.根据id获取Bean对象
//        IAccountService as = (IAccountService)ac.getBean("accountService");
//        as.saveAccount();

//        IAccountService as = (IAccountService)ac.getBean("accountService2");
//        as.saveAccount();

        IAccountService as = (IAccountService)ac.getBean("accountService3");
        as.saveAccount();

    }
}
