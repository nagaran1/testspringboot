package com.gartner.testspringboot.main;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.*;

@RestController
@EnableAutoConfiguration
@SpringBootApplication
public class TestSpringBoot extends SpringBootServletInitializer {

    @RequestMapping("/")
    String root() {
        String testStr = "Nice2";
        return "Its working.."+testStr;
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(TestSpringBoot.class);
    }


    public static void main(String[] args) {
        SpringApplication.run(TestSpringBoot.class, args);
    }

}