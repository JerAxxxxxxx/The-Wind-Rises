package com.windrises.system.service.impl;

import com.windrises.system.service.ITestUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

import com.windrises.core.mapper.TestUserMapper;
import com.windrises.core.entity.po.TestUser;

/**
 * @author JerAxxxxx
 * @version Revision 1.0.0
 * @date 2020/4/27 10:41
 */
@Service
public class TestUserServiceImpl implements ITestUserService {

    @Resource
    private TestUserMapper testUserMapper;

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

}
