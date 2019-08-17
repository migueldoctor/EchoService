package com.kesizo.microservices.client;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@EnableDiscoveryClient
public class EchoService {
    public static void main(String[] args) {
        SpringApplication.run(EchoService.class, args);
    }
}
