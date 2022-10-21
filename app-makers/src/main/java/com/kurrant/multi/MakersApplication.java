package com.kurrant.multi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.kurrant")
public class MakersApplication {
    public static void main(String[] args) {
        SpringApplication.run(MakersApplication.class);
    }
}
