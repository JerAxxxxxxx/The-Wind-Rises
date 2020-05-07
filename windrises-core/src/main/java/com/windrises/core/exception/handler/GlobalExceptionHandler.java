package com.windrises.core.exception.handler;

import com.windrises.core.entity.vo.Result;
import com.windrises.core.exception.BaseException;
import com.windrises.core.exception.ZkException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

import static com.windrises.core.exception.SystemErrorType.SYSTEM_BUSY;

/**
 * @author JerAxxxxx
 * @version Revision 1.0.0
 * @date 2020/4/27 12:39
 */
@ControllerAdvice
@Slf4j
public class GlobalExceptionHandler {

    @ExceptionHandler(value = {BaseException.class})
    public Result baseException(BaseException ex) {
        log.error("base exception:{}", ex.getMessage());
        return Result.fail(ex.getErrorType());
    }

    @ExceptionHandler(value = {Throwable.class})
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public Result throwable(Throwable throwable) {
        log.error(throwable.getMessage());
        throwable.printStackTrace();
        return Result.fail();
    }

    @ExceptionHandler(value = ZkException.class)
    public Result zkException(ZkException ex) {
        log.error("zk exception:{}", ex.getMessage());
        return Result.fail(SYSTEM_BUSY);
    }
}
