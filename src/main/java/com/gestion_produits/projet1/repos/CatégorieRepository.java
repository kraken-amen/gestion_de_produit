package com.gestion_produits.projet1.repos;

import com.gestion_produits.projet1.entities.Catégorie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CatégorieRepository extends JpaRepository<Catégorie, Long> {
}
