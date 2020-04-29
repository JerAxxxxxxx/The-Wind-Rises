package com.windrises.core.mapper;

import com.windrises.core.entity.po.QuartzJob;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author JerAxxxxx
 * @version Revision 1.0.0
 * @date 2020/4/27 10:57
 */
@Mapper
public interface QuartzJobMapper {
    /**
     * 数据删除
     *
     * @param id
     * @return
     */
    int deleteByPrimaryKey(Integer id);


    /**
     * 新增
     *
     * @param record
     * @return
     */
    int insertSelective(QuartzJob record);

    /**
     * 根据主键查询
     *
     * @param id
     * @return
     */
    QuartzJob selectByPrimaryKey(Integer id);

    /**
     * 更新
     *
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(QuartzJob record);


    /**
     * 根据状态查询符合的job
     *
     * @param status 状态
     * @return
     */
    List<QuartzJob> findByPause(@Param("status") String status);
}