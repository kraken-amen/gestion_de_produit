package com.gestion_produits.projet1.repos;

import com.gestion_produits.projet1.entities.Produit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProduitRepository extends JpaRepository<Produit,  Long> {
}
