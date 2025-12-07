package com.example.Client.config;

import com.example.Client.entities.Client;      // Necessary import for your Client model
import com.example.Client.repositories.ClientRepository; // Necessary import for the repository
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration; // 👈 ESSENTIAL ANNOTATION

@Configuration
public class DatabaseConfig {

    @Bean
    public CommandLineRunner initialiserBaseH2(ClientRepository clientRepository) {
        return args -> {
            // Data insertion logic
            clientRepository.save(new Client(null, "Rabab SELIMANI", 23f));
            clientRepository.save(new Client(null, "Amal RAMI", 22f));
            clientRepository.save(new Client(null, "Samir SAFI", 22f));
        };
    }
}