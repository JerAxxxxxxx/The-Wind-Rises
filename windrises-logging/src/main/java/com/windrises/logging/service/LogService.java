package com.windrises.logging.service;

import com.windrises.core.entity.po.Log;

/**
 * @author JerAxxxxx
 * @version Revision 1.0.0
 * @date 2020/4/27 15:58
 */
public interface LogService {


    int deleteByPrimaryKey(Integer id);

    int insert(Log record);

    int insertSelective(Log record);

    Log selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Log record);

    int updateByPrimaryKey(Log record);

}
