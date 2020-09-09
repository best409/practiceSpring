package com.itheima.ui;

import com.itheima.dao.IAccountDao;
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
//        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        //2.根据id获取Bean对象
        IAccountService as = ac.getBean("accountService",IAccountService.class);
        IAccountService as2 = ac.getBean("accountService",IAccountService.class);
        System.out.println(as);

        IAccountDao accountDao = ac.getBean("accountDao1", IAccountDao.class);
        System.out.println(accountDao);

        System.out.println(as == as2);
        as.saveAccount();
        ac.close();
    }
}
