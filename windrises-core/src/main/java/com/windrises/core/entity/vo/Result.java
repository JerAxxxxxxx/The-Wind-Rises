package com.windrises.core.entity.vo;

import com.windrises.core.exception.BaseException;
import com.windrises.core.exception.ErrorType;
import com.windrises.core.exception.SystemErrorType;
import lombok.Getter;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;

/**
 * 统一返回对象
 *
 * @author JerAxxxxx
 * @version Revision 1.0.0
 * @date 2020/4/27 13:47
 */
@Getter
public class Result<T> {

    public static final String SUCCESSFUL_CODE = "000000";
    public static final String SUCCESSFUL_MESG = "处理成功";


    private String code;
    private String message;
    private LocalDateTime time;
    private T data;

    public Result() {
        this.time = LocalDateTime.now();
    }

    /**
     * 包含错误类型的返回
     *
     * @param errorType 错误类型
     */
    public Result(ErrorType errorType) {
        this.code = errorType.getCode();
        this.message = errorType.getMessage();
        this.time = LocalDateTime.now();
    }


    /**
     * 包含错误类型的返回
     *
     * @param errorType 错误类型
     * @param data      返回数据
     */
    public Result(ErrorType errorType, T data) {
        this(errorType);
        this.data = data;
    }

    /**
     * 内部使用，用于构造成功的结果
     *
     * @param code    错误码
     * @param message 返回信息
     * @param data    数据
     */
    private Result(String code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
        this.time = LocalDateTime.now();
    }

    /**
     * 快速创建成功结果并返回结果数据
     *
     * @param data
     * @return Result
     */
    public static Result success(Object data) {
        return new Result<>(SUCCESSFUL_CODE, SUCCESSFUL_MESG, data);
    }

    /**
     * 快速创建成功结果
     *
     * @return Result
     */
    public static Result success() {
        return success(null);
    }

    /**
     * 系统异常类没有返回数据
     *
     * @return Result
     */
    public static Result fail() {
        return new Result(SystemErrorType.SYSTEM_ERROR);
    }

    /**
     * 系统异常类没有返回数据
     *
     * @param baseException
     * @return Result
     */
    public static Result fail(BaseException baseException) {
        return fail(baseException, null);
    }

    /**
     * 系统异常类并返回结果数据
     *
     * @param data
     * @return Result
     */
    public static Result fail(BaseException baseException, Object data) {
        return new Result<>(baseException.getErrorType(), data);
    }

    /**
     * 系统异常类并返回结果数据
     *
     * @param errorType
     * @param data
     * @return Result
     */
    public static Result fail(ErrorType errorType, Object data) {
        return new Result<>(errorType, data);
    }

    /**
     * 系统异常类并返回结果数据
     *
     * @param errorType
     * @return Result
     */
    public static Result fail(ErrorType errorType) {
        return Result.fail(errorType, null);
    }

    /**
     * 系统异常类并返回结果数据
     *
     * @param data
     * @return Result
     */
    public static Result fail(Object data) {
        return new Result<>(SystemErrorType.SYSTEM_ERROR, data);
    }


    /**
     * 成功code=000000
     *
     * @return true/false
     */
    public boolean isSuccess() {
        return SUCCESSFUL_CODE.equals(this.code);
    }

    /**
     * 失败
     *
     * @return true/false
     */
    public boolean isFail() {
        return !isSuccess();
    }
}
