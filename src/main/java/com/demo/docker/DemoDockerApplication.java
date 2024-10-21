package com.demo.docker;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoDockerApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoDockerApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(DemoRepository repository) {
        return args -> {
            repository.save(new DemoEntity(1,"Docker", "desc"));
        };
    }
}
