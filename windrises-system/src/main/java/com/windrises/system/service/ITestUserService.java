package com.windrises.system.service;

import com.windrises.core.entity.po.TestUser;

/**
 * @author JerAxxxxx
 * @version Revision 1.0.0
 * @date 2020/4/27 10:41
 */
public interface ITestUserService {


    int deleteByPrimaryKey(String id);

    int insert(TestUser record);

    int insertSelective(TestUser record);

    TestUser selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(TestUser record);

    int updateByPrimaryKey(TestUser record);

}
