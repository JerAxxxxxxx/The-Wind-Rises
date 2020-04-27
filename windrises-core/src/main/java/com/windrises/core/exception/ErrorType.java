package com.windrises.core.exception;

/**
 * 错误类型接口
 *
 * @author JerAxxxxx
 * @version Revision 1.0.0
 * @date 2020/4/27 13:49
 */
public interface ErrorType {
    /**
     * 返回code
     *
     * @return
     */
    String getCode();

    /**
     * 返回message
     *
     * @return
     */
    String getMessage();
}
