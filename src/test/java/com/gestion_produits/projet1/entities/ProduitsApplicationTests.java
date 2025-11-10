package com.gestion_produits.projet1.entities;

import com.gestion_produits.projet1.repos.ProduitRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

@SpringBootTest
public class ProduitsApplicationTests {
    @Autowired
    private ProduitRepository p;
    @Test
    public void testCreateProduit()
    {Produit produit = new Produit("PC Dell",2200.500,new Date());

    p.save(produit);
    }
}
