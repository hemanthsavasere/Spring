package com.example.springconstructorinjection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication(
//        scanBasePackages = {
//                "com.example.springconstructorinjection",
//                "util"
//        }
//)

@SpringBootApplication
public class SpringConstructorInjectionApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringConstructorInjectionApplication.class, args);
    }

}
