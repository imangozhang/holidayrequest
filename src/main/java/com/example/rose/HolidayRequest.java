package com.example.rose;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(proxyBeanMethods = false)
public class HolidayRequest {

    public static void main(String[] args) {
        SpringApplication.run(HolidayRequest.class, args);
    }

}