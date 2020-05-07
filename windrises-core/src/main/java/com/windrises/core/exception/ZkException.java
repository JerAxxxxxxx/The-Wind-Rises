package com.windrises.core.exception;

/**
 * @author liuhaozhen
 * @version Revision 1.0.0
 * @date 2020/5/7 14:10
 */
public class ZkException extends BaseException {
    public ZkException() {
    }

    public ZkException(ErrorType errorType) {
        super(errorType);
    }

    public ZkException(ErrorType errorType, String message) {
        super(errorType, message);
    }

    public ZkException(ErrorType errorType, String message, Throwable cause) {
        super(errorType, message, cause);
    }
}
