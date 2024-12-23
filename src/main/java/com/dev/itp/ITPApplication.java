package com.dev.itp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ITPApplication implements CommandLineRunner {
    private static final Logger log = LoggerFactory.getLogger(ITPApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(ITPApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        log.info("ok");
    }
}
