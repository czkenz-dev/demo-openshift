package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@SpringBootApplication
public class DemoOpenShiftApplication {

    @GetMapping
    public String welcome() {
        return "Hello World " + LocalDateTime.now();
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoOpenShiftApplication.class, args);
    }

}
