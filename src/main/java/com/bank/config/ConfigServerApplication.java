package com.bank.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Entry point of the Spring Cloud Config Server.
 * Serves externalized configuration for all banking microservices.
 */
@SpringBootApplication
@EnableConfigServer
public class ConfigServerApplication {

    /**
     * Boots the Config Server application.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        SpringApplication.run(ConfigServerApplication.class, args);
    }
}
