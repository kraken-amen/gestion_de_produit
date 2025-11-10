package com.gestion_produits;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@EntityScan(basePackages = "com.gestion_produits.projet1.entities")
@EnableJpaRepositories(basePackages = "com.gestion_produits.projet1.repos")
public class GestionDeProduitApplication {
    public static void main(String[] args) {
        SpringApplication.run(GestionDeProduitApplication.class, args);
    }
}