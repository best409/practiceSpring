package com.itheima.service;

/**
 * @author: zhangycl
 * @date: 2020/9/1
 * @description: 账户的业务层接口
 */
public interface IAccountService {

    /**
     * 模拟保存账户
     */
    void saveAccount();

    /**
     * 模拟更新账户
     * @param i
     */
    void updateAccount(int i);

    /**
     * 删除账户
     * @return
     */
    int  deleteAccount();
}
