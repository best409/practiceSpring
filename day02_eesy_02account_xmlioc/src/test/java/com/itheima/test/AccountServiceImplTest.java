package com.itheima.test;

import com.itheima.domain.Account;
import com.itheima.service.IAccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:bean.xml")
public class AccountServiceImplTest {

    @Autowired
    private IAccountService as;

    @Test
    public void findAllAccount() {
        List<Account> accounts = as.findAllAccount();
        for(Account account :accounts){
            System.out.println(account);
        }
    }

    @Test
    public void findAccountById() {
        Account account = as.findAccountById(1);
        System.out.println(account);
    }

    @Test
    public void saveAccount() {
        Account account = new Account();
        account.setName("test");
        account.setMoney(12234f);
        as.saveAccount(account);

    }

    @Test
    public void updateAccount() {
        Account account = as.findAccountById(4);
        account.setMoney(123456f);
        as.updateAccount(account);
    }

    @Test
    public void deleteAccount() {
        as.deleteAccount(4);
    }
}
