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

    private IAccountDao accountDao = new AccountDaoImpl();

    public void saveAccount() {
        int i = 1;
        accountDao.saveAccount();
        System.out.println(i);
        i++;
    }
}
