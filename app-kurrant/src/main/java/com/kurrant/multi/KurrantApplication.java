package com.kurrant.multi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.kurrant")
public class KurrantApplication {
    public static void main(String[] args) {
        System.setProperty("spring.config.name", "application-mysql");
        SpringApplication.run(KurrantApplication.class);
    }
}
