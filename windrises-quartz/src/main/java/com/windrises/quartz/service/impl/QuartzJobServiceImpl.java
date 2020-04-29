package com.windrises.quartz.service.impl;

import com.windrises.core.exception.BadRequestException;
import com.windrises.quartz.service.IQuartzJobService;
import com.windrises.quartz.utils.QuartzManage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

import com.windrises.core.mapper.QuartzJobMapper;
import com.windrises.core.entity.po.QuartzJob;

import java.util.Date;

import static com.windrises.core.contants.JobConstant.PAUSE;
import static com.windrises.core.contants.JobConstant.START;

/**
 * @author JerAxxxxx
 * @version Revision 1.0.0
 * @date 2020/4/27 10:57
 */
@Service
public class QuartzJobServiceImpl implements IQuartzJobService {

    @Resource
    private QuartzJobMapper quartzJobMapper;

    @Autowired
    private QuartzManage quartzManage;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return quartzJobMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insertSelective(QuartzJob record) {
        record.setCreateTime(new Date()).setUpdateTime(new Date()).setStatus("1");
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
    public void updateStatus(QuartzJob quartzJob) {
        if (quartzJob.getId().equals(1L)) {
            throw new BadRequestException("该任务不可操作");
        }
        if (PAUSE.equals(quartzJob.getStatus())) {
            quartzManage.resumeJob(quartzJob);
            quartzJob.setStatus(START);
        } else {
            quartzManage.pauseJob(quartzJob);
            quartzJob.setStatus(PAUSE);
        }
        quartzJobMapper.updateByPrimaryKeySelective(quartzJob);
    }
}
