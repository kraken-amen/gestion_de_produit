package com.gestion_produits.projet1.services.Fournisseur;

import com.gestion_produits.projet1.entities.Fournisseur;
import com.gestion_produits.projet1.entities.Produit;

import java.util.List;

public interface FournisseurService {
    Fournisseur saveFournisseur(Fournisseur f);
    Fournisseur updateFournisseur(Fournisseur f);
    void deleteFournisseur(Fournisseur f);
    void deleteFournisseurById(long id);
    List<Produit> findAllProduits();
}
