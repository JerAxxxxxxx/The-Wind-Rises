package com.windrises.quartz.service;

import com.windrises.core.entity.po.QuartzJob;

/**
 * @author JerAxxxxx
 * @version Revision 1.0.0
 * @date 2020/4/27 10:57
 */
public interface QuartzJobService {


    int deleteByPrimaryKey(Integer id);

    int insert(QuartzJob record);

    int insertSelective(QuartzJob record);

    QuartzJob selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(QuartzJob record);

    int updateByPrimaryKey(QuartzJob record);

}
