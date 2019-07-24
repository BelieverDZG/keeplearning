package com.dzg.dao;

import com.dzg.domain.Account;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 用户持久层
 */
@Repository
public interface IAccountDao {

    /**
     * 保存账户信息
     * @param account
     */
    @Insert("insert into account(name,money) values (#{name},#{money})")
    void saveAccount(Account account);

    /**
     * 查询所有账户
     * @return
     */
    @Select("select * from account")
    List<Account> findAll();
}
