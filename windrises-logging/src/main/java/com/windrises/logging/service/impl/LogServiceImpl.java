package com.windrises.logging.service.impl;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

import com.windrises.core.entity.po.Log;
import com.windrises.core.mapper.LogMapper;
import com.windrises.logging.service.LogService;

/**
 * @author liuhaozhen
 * @version Revision 1.0.0
 * @date 2020/4/27 15:58
 */
@Service
public class LogServiceImpl implements LogService {

    @Resource
    private LogMapper logMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return logMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Log record) {
        return logMapper.insert(record);
    }

    @Override
    public int insertSelective(Log record) {
        return logMapper.insertSelective(record);
    }

    @Override
    public Log selectByPrimaryKey(Integer id) {
        return logMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Log record) {
        return logMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Log record) {
        return logMapper.updateByPrimaryKey(record);
    }

}
