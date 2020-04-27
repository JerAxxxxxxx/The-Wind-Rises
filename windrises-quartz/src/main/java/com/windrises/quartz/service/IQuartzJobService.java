package com.windrises.quartz.service;

import com.windrises.core.entity.po.QuartzJob;

/**
 * @author JerAxxxxx
 * @version Revision 1.0.0
 * @date 2020/4/27 10:57
 */
public interface IQuartzJobService {


    int deleteByPrimaryKey(Integer id);

    /**
     * 添加
     *
     * @param record
     * @return
     */
    int insertSelective(QuartzJob record);

    QuartzJob selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(QuartzJob record);

}
