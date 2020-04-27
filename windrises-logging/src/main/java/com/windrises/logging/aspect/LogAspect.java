package com.windrises.logging.aspect;

import com.windrises.core.entity.po.Log;
import com.windrises.core.utils.RequestHolder;
import com.windrises.core.utils.SecurityUtils;
import com.windrises.logging.service.LogService;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

/**
 * @author liuhaozhen
 * @version Revision 1.0.0
 * @date 2020/4/27 15:44
 */
@Slf4j
@Component
@Aspect
public class LogAspect {

    private final LogService logService;

    private long currentTime = 0L;

    public LogAspect(LogService logService) {
        this.logService = logService;
    }


    /**
     * 配置切入点,该方法无方法体,主要为了让同类中其他方法使用此切入点
     */
    @Pointcut("@annotation(com.windrises.logging.aop.log.Log)")
    public void logPointcut() {
    }

    /**
     * 配置环绕通知,使用在方法logPointcut()上注册的切入点
     *
     * @param joinPoint join point for advice
     */
    @Around("logPointcut()")
    public Object logAround(ProceedingJoinPoint joinPoint) throws Throwable {
        Object result;
        currentTime = System.currentTimeMillis();
        result = joinPoint.proceed();
        Log log = new Log("INFO", System.currentTimeMillis() - currentTime);
        HttpServletRequest request = RequestHolder.getHttpServletRequest();
        //logService.save(getUsername(), StringUtils.getBrowser(request), StringUtils.getIp(request), joinPoint, log);
        return result;
    }


    public String getUsername() {
        try {
            return SecurityUtils.getUsername();
        } catch (Exception e) {
            return "";
        }
    }
}
