package com.gestion_produits.projet1.entities;

import com.gestion_produits.projet1.repos.FournisseurRepository;
import com.gestion_produits.projet1.repos.ProduitRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class FourniseurApplicationTest {
    @Autowired
    private FournisseurRepository fournisseurRepository;
    @Test
    public void createTest()
    {
        Fournisseur fournisseur=new Fournisseur("amen","amen@gmail.com");
        fournisseurRepository.save(fournisseur);
    }
}
