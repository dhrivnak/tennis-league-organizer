package com.silenth;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TennisServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(TennisServerApplication.class, args);
        Logger logger = LoggerFactory.getLogger(TennisServerApplication.class);
        logger.info("Server started!");
    }
}
