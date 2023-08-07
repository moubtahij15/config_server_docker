package com.example.configserverdocker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigServerDockerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigServerDockerApplication.class, args);
    }

}
