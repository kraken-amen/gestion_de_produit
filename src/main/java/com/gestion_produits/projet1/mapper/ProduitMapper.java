package com.gestion_produits.projet1.mapper;

import com.gestion_produits.projet1.dto.ProduitDTO;
import com.gestion_produits.projet1.entities.Produit;

public class ProduitMapper {
    public static ProduitDTO toDTO(Produit produit) {
        ProduitDTO produitDTO = new ProduitDTO();
        produitDTO.setIdProduit(produit.getIdProduit());
        produitDTO.setNomProduit(produit.getNomProduit());
        produitDTO.setPrixProduit(produit.getPrixProduit());
        produitDTO.setDateCreation(produit.getDateCreation());
        return produitDTO;
    }
    public static Produit toEntity(ProduitDTO produitDTO) {
        Produit produit = new Produit();
        produit.setIdProduit(produitDTO.getIdProduit());
        produit.setNomProduit(produitDTO.getNomProduit());
        produit.setPrixProduit(produitDTO.getPrixProduit());
        produit.setDateCreation(produitDTO.getDateCreation());
        return produit;
    }
}
