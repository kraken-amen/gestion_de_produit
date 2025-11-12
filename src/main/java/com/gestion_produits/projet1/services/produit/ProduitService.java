package com.gestion_produits.projet1.services.produit;
import java.util.List;
import com.gestion_produits.projet1.entities.Produit;
public interface ProduitService {
    Produit saveProduit(Produit p);
    void updateProduit(Produit p,long idProduit);
    void deleteProduit(Produit p);
    void deleteProduitById(Long id);
    Produit getProduit(Long id);
    List<Produit> getAllProduits();
}
