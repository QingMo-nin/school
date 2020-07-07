package com.nin;

import com.nin.mapper.AccountMapper;
import com.nin.pojo.Account;
import com.nin.service.AccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * Created by 狼人 on 2020/7/7.
 */
@RunWith(value = SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "/applicationContext.xml")
public class accoutTest {
    @Autowired
    AccountMapper accountMapper;

    @Test
    public void test1(){
        System.out.println(accountMapper);
        List<Account> accounts = accountMapper.selectAll();
        for (Account a: accounts
             ) {
            System.out.println(a);
        }
    }
}
