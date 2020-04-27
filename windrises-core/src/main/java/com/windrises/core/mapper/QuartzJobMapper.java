package com.windrises.core.mapper;

import com.windrises.core.entity.po.QuartzJob;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author JerAxxxxx
 * @version Revision 1.0.0
 * @date 2020/4/27 10:57
 */
@Mapper
public interface QuartzJobMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(QuartzJob record);

    int insertSelective(QuartzJob record);

    QuartzJob selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(QuartzJob record);

    int updateByPrimaryKey(QuartzJob record);
}