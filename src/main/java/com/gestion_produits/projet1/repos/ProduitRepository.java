package com.gestion_produits.projet1.repos;

import com.gestion_produits.projet1.entities.Produit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProduitRepository extends JpaRepository<Produit,  Long> {
    List<Produit> findByNomProduit(String nomProduit);

}
