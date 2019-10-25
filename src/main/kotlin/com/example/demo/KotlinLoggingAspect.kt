package com.example.demo

import org.aspectj.lang.JoinPoint
import org.aspectj.lang.annotation.Aspect
import org.aspectj.lang.annotation.Before
import org.aspectj.lang.annotation.Pointcut
import org.springframework.stereotype.Component

@Aspect
@Component
class KotlinLoggingAspect {
    @Before(value = "target(com.example.demo.MyBean)")
    fun everyMethodInMyBean(point: JoinPoint){
        println("start method ${point.signature.name}")
    }
}