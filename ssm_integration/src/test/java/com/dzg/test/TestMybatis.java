package com.dzg.test;

import com.dzg.dao.IAccountDao;
import com.dzg.domain.Account;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class TestMybatis {

    @Test
    public void testFindAll() throws IOException {
        /**
         * 1.加载配置文件
         * 2.创建SqlSessionFactory对象
         * 3.创建SqlSession对象
         * 4.获取代理对象
         * 5.查询所有的数据
         * 6.关闭资源
         */
        InputStream in = Resources.getResourceAsStream("src/test/temp/mybatis-cfg.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        SqlSession session = factory.openSession();
        IAccountDao accountDao = session.getMapper(IAccountDao.class);
        List<Account> accounts = accountDao.findAll();
        for (Account account :
                accounts) {
            System.out.println(account);
        }
        session.close();
        in.close();
    }

    @Test
    public void testSave() throws IOException {
        /**
         * 1.加载配置文件
         * 2.创建SqlSessionFactory对象
         * 3.创建SqlSession对象
         * 4.获取代理对象
         * 5.查询所有的数据
         * 6.关闭资源
         */
        InputStream in = Resources.getResourceAsStream("src/test/temp/mybatis-cfg.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        SqlSession session = factory.openSession();
        IAccountDao accountDao = session.getMapper(IAccountDao.class);

        Account account = new Account();
        account.setName("六十六");
        account.setMoney(66d);
        accountDao.saveAccount(account);
        //提交事务
        session.commit();
        session.close();
        in.close();
    }
}
