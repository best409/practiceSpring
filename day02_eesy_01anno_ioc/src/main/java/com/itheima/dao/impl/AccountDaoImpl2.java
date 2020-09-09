package com.itheima.dao.impl;

import com.itheima.dao.IAccountDao;
import org.springframework.stereotype.Repository;

/**
 * @author: zhangycl
 * @date: 2020/8/31
 * @description:
 */
@Repository("accountDao2")
public class AccountDaoImpl2 implements IAccountDao {
    public void saveAccount() {
        System.out.println("保存了账户2222222222222");
    }
}
