package com.itheima.factory;

import com.itheima.service.IAccountService;
import com.itheima.test.AccountServiceImpl;

/**
 * @author: zhangycl
 * @date: 2020/8/31
 * @description: 模拟一个工厂类（该类可能是存在于jar包中的，我们无法通过修改源码的方式来提供默认构造函数）
 */
public class StaticFactory {
    public static IAccountService getAccountService() {
        return new AccountServiceImpl();
    }
}
