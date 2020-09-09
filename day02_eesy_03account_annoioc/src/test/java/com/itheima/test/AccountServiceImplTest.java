package com.itheima.test;

import com.itheima.domain.Account;
import com.itheima.service.IAccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

import static org.junit.Assert.*;

public class AccountServiceImplTest {

    @Test
    public void findAllAccount() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        IAccountService as = ac.getBean("accountService",IAccountService.class);
        List<Account> accounts = as.findAllAccount();
        for(Account account :accounts){
            System.out.println(account);
        }
    }

    @Test
    public void findAccountById() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        IAccountService as = ac.getBean("accountService",IAccountService.class);
        Account account = as.findAccountById(1);
        System.out.println(account);
    }

    @Test
    public void saveAccount() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        IAccountService as = ac.getBean("accountService",IAccountService.class);
        Account account = new Account();
        account.setName("test");
        account.setMoney(12234f);
        as.saveAccount(account);

    }

    @Test
    public void updateAccount() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        IAccountService as = ac.getBean("accountService",IAccountService.class);
        Account account = as.findAccountById(5);
        account.setMoney(123456f);
        as.updateAccount(account);
    }

    @Test
    public void deleteAccount() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        IAccountService as = ac.getBean("accountService",IAccountService.class);
        as.deleteAccount(4);
    }
}
