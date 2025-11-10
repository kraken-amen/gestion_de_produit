package com.gestion_produits.projet1.repos;

import com.gestion_produits.projet1.entities.Fournisseur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FournisseurRepository extends JpaRepository<Fournisseur, Long> {
}
