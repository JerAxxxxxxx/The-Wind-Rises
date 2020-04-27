package com.windrises.core.mapper;

import com.windrises.core.entity.po.TestUser;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author JerAxxxxx
 * @version Revision 1.0.0
 * @date 2020/4/27 10:41
 */
@Mapper
public interface TestUserMapper {
    int deleteByPrimaryKey(String id);

    int insert(TestUser record);

    int insertSelective(TestUser record);

    TestUser selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(TestUser record);

    int updateByPrimaryKey(TestUser record);
}