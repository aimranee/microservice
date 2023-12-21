package com.example.client;


import com.example.client.Model.Client;
import com.example.client.Repository.ClientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DatabaseInitializer {
    @Bean
    public CommandLineRunner initialiserBaseH2(ClientRepository clientRepository) {
        return args -> {
            clientRepository.save(new Client(1L, "Rabab FAHSSI", 23f));
            clientRepository.save(new Client(2L, "Houda EL KORAINI", 22f));
            clientRepository.save(new Client(3L, "Saad BAKANZIZE", 22f));
            clientRepository.save(new Client(4L, "Saad BAKANZIZE", 22f));
        };
    }
}
