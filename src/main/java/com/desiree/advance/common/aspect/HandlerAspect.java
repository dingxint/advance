package com.desiree.advance.common.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect   //该注解声明这个类为一个切面类
@Component
class HandlerAspect {

    @Pointcut(value = "@annotation(com.desiree.advance.common.annotation.ConcatImagePath)")
    private void pointCut1() {
    }

    @Before(value = "pointCut1()")
    public void handle() {

        System.out.println("qiemian");
    }
}