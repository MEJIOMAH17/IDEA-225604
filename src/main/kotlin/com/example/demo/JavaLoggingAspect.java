package com.example.demo;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class JavaLoggingAspect {
    @Before(value = "target(com.example.demo.MyBean)")
    public void everyMethodInMyBean(){
        System.out.println("java aspect");
    }
}
