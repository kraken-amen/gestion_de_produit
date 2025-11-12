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

    public FichierStock( Date dateMàj, int quantite ) {
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
    @OneToOne
    @JoinColumn(name = "produit_id")
    private Produit produit;
}
