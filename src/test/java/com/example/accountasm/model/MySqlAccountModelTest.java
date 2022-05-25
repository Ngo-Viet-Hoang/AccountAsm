package com.example.accountasm.model;

import com.example.accountasm.entity.Account;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MySqlAccountModelTest {

    @Test
    void save() {
        MySqlAccountModel mySqlAccountModel = new MySqlAccountModel();
        Account account = new Account("Ngo Viet Hoang","hoangngo", "hoangngno@gmail.com", "123456", 1 );
        assertEquals(true, mySqlAccountModel.save(account) );
    }

    @Test
    void findAll() {
        MySqlAccountModel mySqlAccountModel = new MySqlAccountModel();
        List<Account> list = mySqlAccountModel.findAll() ;
        assertNotEquals(0, list.size());
    }
}