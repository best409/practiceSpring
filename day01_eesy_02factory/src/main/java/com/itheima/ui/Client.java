package com.itheima.ui;

import com.itheima.factory.BeanFactory;
import com.itheima.service.IAccountService;

/**
 * @author: zhangycl
 * @date: 2020/8/31
 * @description: 模拟一个表现层，用于调用业务层
 */
public class Client {

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            IAccountService as = (IAccountService)BeanFactory.getBean("accountService");
            System.out.println(as);
            as.saveAccount();

        }
    }
}
