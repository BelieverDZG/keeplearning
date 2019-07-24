package com.dzg.service.impl;

import com.dzg.dao.IAccountDao;
import com.dzg.domain.Account;
import com.dzg.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("accountService")
public class AccountServiceImpl implements IAccountService {

    @Autowired
    private IAccountDao accountDao;

    @Override
    public void saveAccount(Account account) {
        System.out.println("业务层-执行保存账户！");
        accountDao.saveAccount(account);
    }

    @Override
    public List<Account> findAll() {
        System.out.println("业务层-执行查找所有账户");
        List<Account> accounts = accountDao.findAll();
        return accounts;
    }
}
