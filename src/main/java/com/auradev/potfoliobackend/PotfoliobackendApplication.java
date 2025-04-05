package com.auradev.potfoliobackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(exclude = {org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration.class})
public class PotfoliobackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(PotfoliobackendApplication.class, args);
    }

}
