package com.windrises.core.log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author liuhaozhen
 * @version Revision 1.0.0
 * @date 2020/5/28 15:56
 */
public class LoggerUtils {
    public static <T> Logger Logger(Class<T> clazz) {
        return LoggerFactory.getLogger(clazz);
    }

    /**
     * 打印到指定的文件下
     *
     * @param desc 日志文件名称
     * @return
     */
    public static Logger Logger(LogFileName desc) {
        return LoggerFactory.getLogger(desc.getLogFileName());
    }
}
