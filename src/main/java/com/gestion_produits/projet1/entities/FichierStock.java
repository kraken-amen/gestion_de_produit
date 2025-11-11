package com.gestion_produits.projet1.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
@Data
@Entity
public class FichierStock {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int quantite;
    private Date dateMàj;

    public FichierStock() {
    }

    public FichierStock(Long id, Produit produit, Date dateMàj, int quantite) {
        this.id = id;
        this.produit = produit;
        this.dateMàj = dateMàj;
        this.quantite = quantite;
    }

    @Override
    public String toString() {
        return "FichierStock{" +
                "id=" + id +
                ", quantite=" + quantite +
                ", dateMàj=" + dateMàj +
                '}';
    }
    @OneToOne(mappedBy = "fiche",cascade = CascadeType.ALL)
    private Produit produit;
}
