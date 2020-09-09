package com.itheima.service.impl;

import com.itheima.service.IAccountService;

/**
 * @author: zhangycl
 * @date: 2020/9/1
 * @description: 账户的业务层实现类
 */
public class AccountServiceAOPImpl implements IAccountService {

    @Override
    public void saveAccount() {
        System.out.println("执行了保存");
    }

    @Override
    public void updateAccount(int i) {
        System.out.println("执行了更新"+i);

    }

    @Override
    public int deleteAccount() {
        System.out.println("执行了删除");
        return 0;
    }
}
