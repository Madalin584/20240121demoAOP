package com.example.demo.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class AfterAopAspect {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @AfterReturning(value = "com.example.demo.aspect.CommonJoinPointConfig.dataLayerExecution()",
        returning = "result"
    )
    public void afterReturning(JoinPoint joinPoint, Object result) {
        //logger.info(" {} returned with value {} ", joinPoint, result);
    }

    @AfterThrowing(value = "com.example.demo.aspect.CommonJoinPointConfig.dataLayerExecution()",
            throwing = "exception"
    )
    public void afterReturning(JoinPoint joinPoint, Exception exception) {
        //logger.info(" {} after returning {} ", joinPoint, exception);
    }

    @After(value = "com.example.demo.aspect.CommonJoinPointConfig.allLayerExecution()")
    public void after(JoinPoint joinPoint) {
        //logger.info(" after {} ", joinPoint);
    }

    @After(value = "com.example.demo.aspect.CommonJoinPointConfig.TrackTimeAnnotation()")
    public void TrackTimeAnnotation(JoinPoint joinPoint) {
        //logger.info(" Track time here ", joinPoint);
    }

    @After(value = "com.example.demo.aspect.CommonJoinPointConfig.testAnnotation()")
    public void testAnnotation(JoinPoint joinPoint) {
        System.out.println(joinPoint.getArgs());
        System.out.println(joinPoint.getSignature().getModifiers());
        logger.info(" Test annotation here ", joinPoint);
    }
}
