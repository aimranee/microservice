package com.example.voiture;

import com.example.voiture.entities.Voiture;
import com.example.voiture.repository.VoitureRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableFeignClients
public class VoitureApplication {

	public static void main(String[] args) {
		SpringApplication.run(VoitureApplication.class, args);
	}

	@Bean
	CommandLineRunner initialiserBaseH2(VoitureRepository voitureRepository, ClientService clientService) {
		return args -> {
			Client c1 = clientService.clientById(2L);
			Client c2 = clientService.clientById(1L);
			System.out.println("**************************");
			System.out.println("Id est :" + c2.getId());
			System.out.println("Nom est :" + c2.getNom());
			System.out.println("**************************");
			System.out.println("**************************");
			System.out.println("Id est :" + c1.getId());
			System.out.println("Nom est :" + c1.getNom());
			System.out.println("Nom est :" + c1.getAge());
			System.out.println("**************************");
			voitureRepository.save(new Voiture(Long.parseLong("1"), "Toyota",
					"A25 333", "Corolla", c2.getId(), c2));
			voitureRepository.save(new Voiture(Long.parseLong("2"), "Renault",
					"B 6 3456", "Megane",  c2.getId(), c2));
			voitureRepository.save(new Voiture(Long.parseLong("3"), "Peugeot",
					"A 55 4444", "301", c1.getId(), c1));
		};
	};
}
