package com.gestion_produits.projet1.entities;

import com.gestion_produits.projet1.repos.ProduitRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;
import java.util.List;

@SpringBootTest
public class ProduitsApplicationTests {
    @Autowired
    private ProduitRepository produitrepos ;
    @Test
    public void testCreateProduit()
    {Produit produit = new Produit("oooo",2240.500,new Date());

        produitrepos.save(produit);
    }
    @Test
    public void testFindProduit() {
        Produit p = produitrepos.findById(4L).get();
        System.out.println(p); }
    @Test
    public void testUpdateProduit() {
        Produit p = produitrepos.findById(5L).get();
        p.setPrixProduit(1000.0);
        produitrepos.save(p);}
    @Test
    public void testDeleteProduit()
    { produitrepos.deleteById(6L);; }
    @Test
    public void testListerTousProduits() {
        List<Produit> prods = produitrepos.findAll();
        for (Produit p : prods)
        {
            System.out.println(p);
        }
    }

}
