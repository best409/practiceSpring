package com.itheima.dao.impl;

import com.itheima.dao.IAccountDao;

/**
 * @author: zhangycl
 * @date: 2020/8/31
 * @description: 账户的持久层实现类
 */
public class AccountDaoImpl implements IAccountDao {


    public void saveAccount() {
        System.out.println("保存了账户");
    }
}
