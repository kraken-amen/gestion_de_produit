package com.gestion_produits.projet1.repos;

import com.gestion_produits.projet1.entities.FichierStock;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FichierStockRepository extends JpaRepository<FichierStock, Long> {
}
