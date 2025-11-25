package com.gestion_produits.projet1.controller;

import com.gestion_produits.projet1.entities.Produit;
import com.gestion_produits.projet1.services.produit.ProduitServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RequestMapping("produit")
@RestController
public class ProduitController {
    @Autowired
    private ProduitServiceImpl produitService;
    @GetMapping("/all")
    public List<Produit> getAllProduit() {
        return produitService.getAllProduits();
    }
    @PostMapping("/ajouter")
    public Produit ajouterProduit(@RequestBody Produit p) {
        return produitService.saveProduit(p);
    }
    @DeleteMapping("/delete")
    public void deleteProduit(Long id) {
        produitService.deleteProduitById(id);
    }
}
