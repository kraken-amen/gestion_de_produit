package com.gestion_produits.projet1.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
@Data
@Entity
public class Fournisseur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String email;

    public Fournisseur() {}

    public Fournisseur(String nom, String email) {
        this.nom = nom;
        this.email = email;
    }
    @Override
    public String toString() {
        return "Fournisseur{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
    @ManyToMany
    @JoinTable(name = "produit_fournisseur",
            joinColumns = {@JoinColumn(name = "idp")},
            inverseJoinColumns = {@JoinColumn(name = "idf")})
    private List<Produit> produit = new ArrayList<>();

}
