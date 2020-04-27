package com.windrises.quartz.service;

import com.windrises.core.entity.po.QuartzLog;

/**
 * @author JerAxxxxx
 * @version Revision 1.0.0
 * @date 2020/4/27 11:06
 */
public interface QuartzLogService {


    int deleteByPrimaryKey(Integer id);

    int insert(QuartzLog record);

    int insertSelective(QuartzLog record);

    QuartzLog selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(QuartzLog record);

    int updateByPrimaryKey(QuartzLog record);

}
