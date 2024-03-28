package com.example.demo.service;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class HelloService {

    @Cacheable("hello")
    public String hello() {
        System.out.println("Hello, Spring Boot!");
        return "Hello, Spring Boot!";
    }
}
