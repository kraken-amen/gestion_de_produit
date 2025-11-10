package com.gestion_produits.projet1.entities;

import com.gestion_produits.projet1.repos.CatégorieRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;



@SpringBootTest
public class CatégorieApplicationTests {
    @Autowired
    private CatégorieRepository catégorieRepository;
    @Test
    public void testCreateCategorie()
    {Catégorie catégorie=new Catégorie("kraken","ali");

    catégorieRepository.save(catégorie);
    }
}
