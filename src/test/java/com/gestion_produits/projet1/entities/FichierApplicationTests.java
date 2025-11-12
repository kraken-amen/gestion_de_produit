package com.gestion_produits.projet1.entities;

import com.gestion_produits.projet1.repos.FichierStockRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

@SpringBootTest
public class FichierApplicationTests {
    @Autowired
    private FichierStockRepository fichierStockRepository;
    @Test
    public void contextLoads()
    {
        FichierStock fichierStock = new FichierStock(new Date(),58885);
        fichierStockRepository.save(fichierStock);
    }
}
