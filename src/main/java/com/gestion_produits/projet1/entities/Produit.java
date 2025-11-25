package com.gestion_produits.projet1.entities;
import java.time.LocalDate;
import java.util.Date;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Produit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProduit;
    private String nomProduit;
    private Double prixProduit;
    private LocalDate dateCreation;

    public Produit() {
    }

    public Produit( String nomProduit, Double prixProduit, LocalDate dateCreation) {
        this.nomProduit = nomProduit;
        this.prixProduit = prixProduit;
        this.dateCreation = dateCreation;
    }

    @Override

    public String toString() {
        return "Produit{" +
                "idProduit=" + idProduit +
                ", nomProduit='" + nomProduit + '\'' +
                ", prixProduit=" + prixProduit +
                ", dateCreation=" + dateCreation +
                '}';
    }
    @ManyToOne
    @JoinColumn(name = "cat_id")
    private Catégorie cat;

    @OneToOne(mappedBy = "produit")
    private FichierStock fichierStock;

}
