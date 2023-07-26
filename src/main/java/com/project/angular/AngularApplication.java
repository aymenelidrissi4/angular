package com.project.angular;

import com.project.angular.enumerations.Status;
import com.project.angular.models.Server;
import com.project.angular.repositories.ServerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import static com.project.angular.enumerations.Status.*;

@SpringBootApplication
public class AngularApplication {

    public static void main(String[] args) {
        SpringApplication.run(AngularApplication.class, args);
    }

    @Bean
    CommandLineRunner run(ServerRepository serverRepository) {
        return args -> {
            serverRepository.save(new Server(null, "192.168.1.160", "ubuntu linux", "16GB", "PC", "http://localhost:8080/server/image/server1.png", SERVER_UP));
        };
    }

}
