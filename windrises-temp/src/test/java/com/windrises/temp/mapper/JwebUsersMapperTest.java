package com.windrises.temp.mapper;

import com.windrises.temp.TempApplication;
import com.windrises.temp.entity.po.Users;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import junit.framework.TestCase;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = TempApplication.class)
public class JwebUsersMapperTest extends TestCase {
    @Autowired
    UsersMapper usersMapper;

    @Test
    public void method1() {
        Users users = usersMapper.selectByPrimaryKey(1L);
        System.out.println(users);
    }
}