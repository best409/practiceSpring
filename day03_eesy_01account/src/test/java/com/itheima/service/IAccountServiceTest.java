package com.itheima.service;

import com.itheima.dao.IAccountDao;
import com.itheima.domain.Account;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:bean.xml")
public class IAccountServiceTest {

    @Autowired
    private IAccountService accountService;


    @Test
    public void findAllAccount() {

        List<Account> accounts =  accountService.findAllAccount();
        for (Account account :accounts) {
            System.out.println(account);
        }

    }

    @Test
    public void findAllTransfer() {

        accountService.transfer("aaa","bbb",500f);

    }
}
