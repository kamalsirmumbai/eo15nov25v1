package com.example.evenodd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EvenOddApp {
    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(EvenOddApp.class);
        app.setDefaultProperties(Collections.singletonMap("server.port", System.getenv("PORT")));
        app.run(args);
    }
}
