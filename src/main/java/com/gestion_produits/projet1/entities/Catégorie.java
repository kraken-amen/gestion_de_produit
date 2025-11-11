package com.gestion_produits.projet1.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
@Data
@Entity
public class Catégorie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String description;

    public Catégorie(String nom, String description) {
        this.nom = nom;
        this.description = description;
    }
    public Catégorie() {
    }
    @Override
    public String toString() {
        return "Catégorie{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
    @OneToMany(mappedBy = "cat")
    public List<Produit> produits=new ArrayList<>();

}
