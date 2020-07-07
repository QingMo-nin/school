package com.nin.service;

import com.nin.mapper.AccountMapper;
import com.nin.pojo.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by 狼人 on 2020/7/7.
 */
@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    AccountMapper accountMapper;

    @Override
    public List<Account> selectAll() {
        return accountMapper.selectAll();
    }
}
