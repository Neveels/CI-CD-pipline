package com.javateckie.cicdactions;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class CicdActionsApplication {

    echo "# CI-CD-pipline" >> README.md
    git init
    git add README.md
    git commit -m "first commit"
    git branch -M main
    git remote add origin https://github.com/Neveels/CI-CD-pipline.git
    git push -u origin main

    @GetMapping("/hello")
    public String welcome() {
        return "Welcome to CICD";
    }

    public static void main(String[] args) {
        SpringApplication.run(CicdActionsApplication.class, args);
    }

}
