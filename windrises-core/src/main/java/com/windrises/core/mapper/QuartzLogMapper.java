package com.windrises.core.mapper;

import com.windrises.core.entity.po.QuartzLog;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author JerAxxxxx
 * @version Revision 1.0.0
 * @date 2020/4/27 11:06
 */
@Mapper
public interface QuartzLogMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(QuartzLog record);

    int insertSelective(QuartzLog record);

    QuartzLog selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(QuartzLog record);

    int updateByPrimaryKey(QuartzLog record);
}