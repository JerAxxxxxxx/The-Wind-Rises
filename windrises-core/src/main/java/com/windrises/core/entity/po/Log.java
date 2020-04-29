package com.windrises.core.entity.po;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author JerAxxxxx
 * @version Revision 1.0.0
 * @date 2020/4/27 15:58
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Log {
    private Integer id;

    /**
     * 操作用户
     */
    private String username;

    /**
     * 描述
     */
    private String description;

    /**
     * 方法名
     */
    private String method;

    /**
     * 参数
     */
    private String parms;

    /**
     * 日志类型
     */
    private String logType;

    /**
     * 请求ip
     */
    private String requestIp;

    /**
     * 地址
     */
    private String address;

    /**
     * 浏览器
     */
    private String browser;

    /**
     * 请求耗时
     */
    private Long time;

    /**
     * 异常详细
     */
    private String exceptionDetail;

    /**
     * 创建日期
     */
    private Date createTime;

    public Log(String logType, Long time) {
        this.logType = logType;
        this.time = time;
    }
}