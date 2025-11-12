package com.gestion_produits.projet1.services.Catégorie;

import com.gestion_produits.projet1.entities.Catégorie;

import java.util.List;

public interface CatégorieService {
    Catégorie saveCat(Catégorie c);
    Catégorie getCatByID(long id);
    void updateCatByID(long id,Catégorie c);
    Catégorie deleteCatByID(long id);

    List<Catégorie> getCatByNomProduit();
}
