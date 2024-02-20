package com.xyz.openapi.client;

import com.xyz.openapi.client.config.ClientConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import(ClientConfiguration.class)
public class Client {

    public static void main(String[] args) {
        SpringApplication.run(Client.class, args);
    }

}
