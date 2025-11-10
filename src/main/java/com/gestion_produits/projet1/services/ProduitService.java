package com.gestion_produits.projet1.services;
import java.util.List;
import com.gestion_produits.projet1.entities.Produit;
public interface ProduitService {
    Produit saveProduit(Produit p);
    Produit updateProduit(Produit p);
    void deleteProduit(Produit p);
    void deleteProduitById(Long id);
    Produit getProduit(Long id);
    List<Produit> getAllProduits();
}
