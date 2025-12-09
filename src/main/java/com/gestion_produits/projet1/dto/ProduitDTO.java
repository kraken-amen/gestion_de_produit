package com.gestion_produits.projet1.dto;

import lombok.Data;

import java.time.LocalDate;
@Data
public class ProduitDTO {
    private Long idProduit;
    private String nomProduit;
    private Double prixProduit;
    private LocalDate dateCreation;

}
