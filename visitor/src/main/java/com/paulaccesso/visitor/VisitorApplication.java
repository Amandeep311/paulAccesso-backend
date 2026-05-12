package com.paulaccesso.visitor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import jakarta.annotation.PostConstruct;
import java.util.TimeZone;

@SpringBootApplication
@EnableScheduling
public class VisitorApplication {
    
    @PostConstruct
    public void init() {
        // Set default timezone to IST
        TimeZone.setDefault(TimeZone.getTimeZone("Asia/Kolkata"));
        System.out.println("========================================");
        System.out.println("Current Default Timezone: " + TimeZone.getDefault().getID());
        System.out.println("========================================");
    }
    
    public static void main(String[] args) {
        SpringApplication.run(VisitorApplication.class, args);
        System.out.println("========================================");
        System.out.println("Successfully started VisitorApplication with IST timezone.");
        System.out.println("========================================");
    }
}