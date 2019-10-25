package com.example.demo

import org.springframework.boot.context.event.ApplicationReadyEvent
import org.springframework.context.event.EventListener
import org.springframework.stereotype.Component
import javax.annotation.PostConstruct

@Component
class MyBean {
    @EventListener(ApplicationReadyEvent::class)
    fun hello(){
        print("hello")
    }
}
