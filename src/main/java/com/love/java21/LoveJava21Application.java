package com.love.java21;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.love.java21.services")
public class LoveJava21Application {
    public static void main(String[] args) {
        SpringApplication.run(LoveJava21Application.class, args);
    }

}
