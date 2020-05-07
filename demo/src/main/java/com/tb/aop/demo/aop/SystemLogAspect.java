package com.tb.aop.demo.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.lang.reflect.Method;
import java.util.Date;
import java.util.UUID;

/**
 * @author 杨建
 * @E-mail: email
 * @version 创建时间：2015-10-19 下午4:29:05
 * @desc 切点类
 */

@Aspect
@Component
public class SystemLogAspect {

    private  static  final Logger logger = LoggerFactory.getLogger(SystemLogAspect. class);

    @Pointcut("")
    public  void controllerAspect() {
    }

    /**
     * 前置通知 用于拦截Controller层记录用户的操作
     *
     * @param joinPoint 切点
     */
    @Before("controllerAspect()")
    public void doBefore(JoinPoint joinPoint) {

        System.out.println("==========执行前置通知===============");
    }


}
