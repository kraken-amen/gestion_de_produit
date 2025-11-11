package com.gestion_produits.projet1.entities;

import com.gestion_produits.projet1.repos.FournisseurRepository;
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
        Fournisseur fournisseur=new Fournisseur("Dell","amen@gmail.com");
        fournisseurRepository.save(fournisseur);
    }
}
