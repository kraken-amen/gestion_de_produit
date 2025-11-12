package com.gestion_produits.projet1.services.FichierStock;

import com.gestion_produits.projet1.entities.FichierStock;
import com.gestion_produits.projet1.entities.Produit;

import java.util.List;

public interface FichierService {
    FichierStock findById(long id);
    void updateFichier(FichierStock fichierStock,long id);
    void deleteFichier(long id);
    List<FichierStock> findAll();
}
