package com.windrises.quartz.service.impl;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

import com.windrises.core.mapper.QuartzJobMapper;
import com.windrises.core.entity.po.QuartzJob;
import com.windrises.quartz.service.QuartzJobService;

/**
 * @author JerAxxxxx
 * @version Revision 1.0.0
 * @date 2020/4/27 10:57
 */
@Service
public class QuartzJobServiceImpl implements QuartzJobService {

    @Resource
    private QuartzJobMapper quartzJobMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return quartzJobMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(QuartzJob record) {
        return quartzJobMapper.insert(record);
    }

    @Override
    public int insertSelective(QuartzJob record) {
        return quartzJobMapper.insertSelective(record);
    }

    @Override
    public QuartzJob selectByPrimaryKey(Integer id) {
        return quartzJobMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(QuartzJob record) {
        return quartzJobMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(QuartzJob record) {
        return quartzJobMapper.updateByPrimaryKey(record);
    }

}
