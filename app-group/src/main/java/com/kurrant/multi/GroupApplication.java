package com.kurrant.multi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.kurrant")
public class GroupApplication {
    public static void main(String[] args) {
        //타 모듈의 .properties 파일 가져오기
        System.setProperty("spring.config.name", "application-mysql");
        SpringApplication.run(GroupApplication.class);
    }
}
