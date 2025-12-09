package com.gestion_produits.projet1.controller;

import com.gestion_produits.projet1.dto.ProduitDTO;
import com.gestion_produits.projet1.entities.Produit;
import com.gestion_produits.projet1.mapper.ProduitMapper;
import com.gestion_produits.projet1.services.produit.ProduitServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("produit")

public class ProduitController {
    @Autowired
    private ProduitServiceImpl produitService;
    @GetMapping("/all")
    public List<Produit> getAllProduit() {
        return produitService.getAllProduits();
    }
    @PostMapping("/ajouter")
    public ProduitDTO ajouterProduit(@RequestBody ProduitDTO p)
    {
        Produit entity = ProduitMapper.toEntity(p);
        Produit s=produitService.saveProduit(entity);
        return ProduitMapper.toDTO(s);
    }
    @PutMapping("/{id}")
        public Produit modifierProduit(@PathVariable Long id,@RequestBody Produit p)
        {
            p.setIdProduit(id);
            return produitService.saveProduit(p);
        }
    @DeleteMapping("/delete/{id}")
    public void deleteProduit(@PathVariable Long id)
    {
        produitService.deleteProduitById(id);
    }
}
