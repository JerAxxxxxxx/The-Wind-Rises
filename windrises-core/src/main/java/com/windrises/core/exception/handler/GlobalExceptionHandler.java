package com.windrises.core.exception.handler;

import com.windrises.core.entity.vo.Result;
import com.windrises.core.exception.BaseException;
import com.windrises.core.exception.ZkException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

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

    /**
     * 请求参数检验不通过
     * <p>
     * 处理那些controller类使用了@Validated注解 并且在rest接口方法参数（一般是get方式url传参）中使用了比如@NotBlank等等
     * 的javax.validation包提供的校验注解  然而前端提供的参数不符合注解所声明的约束条件
     * <p>
     * 如不做此处理，spring框架一般是会直接返回 httpstatus 为 400(bad_request) 的响应
     *
     * @param e
     * @return 返回报文附带参数校验失败列表
     */
    @ExceptionHandler(ConstraintViolationException.class)
    public Result handleConstraintViolationException(ConstraintViolationException e) {
        Set<ConstraintViolation<?>> constraintViolations = e.getConstraintViolations();
        String collect = constraintViolations.stream().map(ConstraintViolation::getMessage).collect(Collectors.joining(","));
        return Result.fail(collect);
    }

    /**
     * 请求参数检验不通过
     * <p>
     * 处理那些controller类使用了@Validated注解 并且在rest接口方法参数（一般是get方式url传参）
     * 如果参数未提供则会走这个方法
     * <p>
     * 如不做此处理，spring框架一般是会直接返回 httpstatus 为 400(bad_request) 的响应
     *
     * @param e
     * @return 返回报文附带参数校验失败列表
     */
    @ExceptionHandler(MissingServletRequestParameterException.class)
    public Result handleMissingServletRequestParameterException(MissingServletRequestParameterException e) {
        if (log.isDebugEnabled()) {
            log.debug("请求参数校验不通过: " + e.getParameterName() + "参数未提供", e);
        }
        return Result.fail("参数未提供");
    }

    /**
     * 请求参数校验不通过
     * <p>
     * 处理@Valid的参数校验，校验类型一般是json格式数据报文
     *
     * @param e
     * @return 返回报文附带参数校验失败列表
     */
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public Result handleMethodArgumentNotValidException(MethodArgumentNotValidException e) {
        BindingResult bindingResult = e.getBindingResult();
        List<FieldError> fieldErrors = bindingResult.getFieldErrors();
        String collect = fieldErrors.stream().map(FieldError::getDefaultMessage).collect(Collectors.joining(","));
        if (log.isDebugEnabled()) {
            log.debug("请求参数校验不通过: " + collect, e);
        }
        return Result.fail(collect);
    }
}
