package com.gestion_produits.projet1.services.produit;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import com.gestion_produits.projet1.entities.Produit;
import com.gestion_produits.projet1.repos.ProduitRepository;
import org.springframework.stereotype.Service;

@Service
public class ProduitServiceImpl implements ProduitService {
    @Autowired
    ProduitRepository produitRepository;
    @Override
    public Produit saveProduit(Produit p) {
        return produitRepository.save(p);
    }
    @Override
    public Produit updateProduit(Produit p) {
        Optional<Produit> produit=produitRepository.findById(p.getIdProduit());
        if(produit.isPresent()) {
            produit.get().setNomProduit(p.getNomProduit());
            produit.get().setPrixProduit(p.getPrixProduit());
            produit.get().setDateCreation(p.getDateCreation());
        }
        return produitRepository.save(p);
    }
    @Override
    public void deleteProduit(Produit p) {
        produitRepository.delete(p);
    }
    @Override
    public void deleteProduitById(Long id) {
        produitRepository.deleteById(id);
    }
    @Override
    public Produit getProduit(Long id) {
        return produitRepository.findById(id).get();
    }
    @Override
    public List<Produit> getAllProduits() {
        return produitRepository.findAll();
    }
}
