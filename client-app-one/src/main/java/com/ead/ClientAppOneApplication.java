package com.ead;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class ClientAppOneApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClientAppOneApplication.class, args);
    }

}