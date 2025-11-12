package com.gestion_produits.projet1.services.Fournisseur;

import com.gestion_produits.projet1.entities.Fournisseur;

import java.util.List;

public interface FournisseurService {
    Fournisseur saveFournisseur(Fournisseur f);
    Fournisseur getFournisseurById(Long id);
    void updateFournisseur(Fournisseur f,long id);
    void deleteFournisseur(Fournisseur f);
    void deleteFournisseurById(long id);
    List<Fournisseur> findAllFournisseur();
}
