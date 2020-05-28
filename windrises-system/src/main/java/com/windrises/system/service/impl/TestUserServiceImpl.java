package com.windrises.system.service.impl;

import com.windrises.system.service.ITestUserService;
import com.windrises.system.test.AsyncTest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

import com.windrises.core.mapper.TestUserMapper;
import com.windrises.core.entity.po.TestUser;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author JerAxxxxx
 * @version Revision 1.0.0
 * @date 2020/4/27 10:41
 */
@Slf4j
@Service
public class TestUserServiceImpl implements ITestUserService {

    private final TestUserMapper testUserMapper;

    private final AsyncTest test;

    public TestUserServiceImpl(AsyncTest test, TestUserMapper testUserMapper) {
        this.test = test;
        this.testUserMapper = testUserMapper;
    }

    @Override
    public int deleteByPrimaryKey(String id) {
        return testUserMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(TestUser record) {
        return testUserMapper.insert(record);
    }

    @Override
    public int insertSelective(TestUser record) {
        return testUserMapper.insertSelective(record);
    }

    @Override
    public TestUser selectByPrimaryKey(String id) {
        return testUserMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(TestUser record) {
        return testUserMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(TestUser record) {
        return testUserMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<TestUser> getAll() {
        //test();
        test.test();
        String test = testUserMapper.getAll().stream()
                .filter(testUser -> "123".equals(testUser.getRole()))
                .map(TestUser::getRole)
                .collect(Collectors.toList())
                .stream()
                .reduce((a, b) -> a + "???" + b)
                .orElse("无数据");
        log.info(test);
        return testUserMapper.getAll();
    }
}
