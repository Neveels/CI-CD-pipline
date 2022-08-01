package com.javateckie.cicdactions;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class CicdActionsApplication {


    @GetMapping("/hello")
    public String welcome() {
        return "Welcome to CICD";
    }

    public static void main(String[] args) {
        SpringApplication.run(CicdActionsApplication.class, args);
    }

}
