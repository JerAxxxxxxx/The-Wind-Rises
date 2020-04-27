package com.windrises.quartz.service.impl;

import com.windrises.quartz.service.IQuartzLogService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

import com.windrises.core.mapper.QuartzLogMapper;
import com.windrises.core.entity.po.QuartzLog;

/**
 * @author JerAxxxxx
 * @version Revision 1.0.0
 * @date 2020/4/27 11:06
 */
@Service
public class QuartzLogServiceImpl implements IQuartzLogService {

    @Resource
    private QuartzLogMapper quartzLogMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return quartzLogMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(QuartzLog record) {
        return quartzLogMapper.insert(record);
    }

    @Override
    public int insertSelective(QuartzLog record) {
        return quartzLogMapper.insertSelective(record);
    }

    @Override
    public QuartzLog selectByPrimaryKey(Integer id) {
        return quartzLogMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(QuartzLog record) {
        return quartzLogMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(QuartzLog record) {
        return quartzLogMapper.updateByPrimaryKey(record);
    }

}
