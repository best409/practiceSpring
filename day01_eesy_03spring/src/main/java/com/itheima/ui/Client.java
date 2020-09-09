package com.itheima.ui;

import com.itheima.dao.IAccountDao;
import com.itheima.service.IAccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import sun.net.InetAddressCachePolicy;

/**
 * @author: zhangycl
 * @date: 2020/8/31
 * @description: 模拟一个表现层，用于调用业务层
 */
public class Client {

    public static void main(String[] args) {
        //1.获取核心容器对象
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        //2.根据id获取Bean对象
        IAccountService as = (IAccountService)ac.getBean("accountService");
        IAccountDao accountDao = ac.getBean("accountDao", IAccountDao.class);


        System.out.println(as);
        System.out.println(accountDao);
        as.saveAccount();


    }
}
