package com.dzg.service;

import com.dzg.domain.Account;

import java.util.List;

/**
 * 账户业务层
 */
public interface IAccountService {

    /**
     * 保存账户信息
     * @param account
     */
    void saveAccount(Account account);

    /**
     * 查询所有账户
     * @return
     */
    List<Account> findAll();
}
