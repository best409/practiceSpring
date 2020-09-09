package com.itheima.test;

import com.itheima.dao.impl.AccountDaoImpl;
import com.itheima.dao.IAccountDao;
import com.itheima.service.IAccountService;

/**
 * @author: zhangycl
 * @date: 2020/8/31
 * @description:
 */
public class AccountServiceImpl implements IAccountService {

    private IAccountDao accountDao;

    public void setAccountDao(IAccountDao accountDao) {
        this.accountDao = accountDao;
    }

    public AccountServiceImpl() {
        System.out.println("对象创建了");
    }


    public void saveAccount() {
        accountDao.saveAccount();
    }
}
