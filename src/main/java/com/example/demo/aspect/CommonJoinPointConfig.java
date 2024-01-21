package com.example.demo.aspect;

import org.aspectj.lang.annotation.Pointcut;

public class CommonJoinPointConfig {
    @Pointcut("execution (* com.example.demo.data.*.*(..))")
    public void dataLayerExecution() {}

    @Pointcut("execution (* com.example.demo.business.*.*(..))")
    public void businessLayerExecution() {}

    @Pointcut("com.example.demo.aspect.CommonJoinPointConfig.dataLayerExecution() && com.example.demo.aspect.CommonJoinPointConfig.businessLayerExecution()")
    public void allLayerExecution() {}

    @Pointcut("bean(*dao*)")
    public void beanStartingWithDao() {}

    @Pointcut("within (com.example.demo.data..*))")
    public void dataLayerExecutionWithWithin() {}

    @Pointcut("@annotation(com.example.demo.aspect.TrackTime)")
    public void TrackTimeAnnotation(){}

    @Pointcut("@annotation(com.example.demo.aspect.TestAnnotation)")
    public void testAnnotation(){}
}
