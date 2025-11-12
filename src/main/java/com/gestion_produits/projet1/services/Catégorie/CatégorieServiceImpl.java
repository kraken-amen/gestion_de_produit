package com.gestion_produits.projet1.services.Catégorie;

import com.gestion_produits.projet1.entities.Catégorie;
import com.gestion_produits.projet1.repos.CatégorieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CatégorieServiceImpl implements CatégorieService{
    @Autowired
    CatégorieRepository catRepository;

    @Override
    public Catégorie saveCat(Catégorie c) {
        return catRepository.save(c);
    }

    @Override
    public Catégorie getCatByID(long id) {
        return catRepository.findById(id).get();
    }

    @Override
    public void updateCatByID(long id,Catégorie c) {
        catRepository.findById(id).ifPresent(Catégorie -> {
            Catégorie.setNom(c.getNom());
            Catégorie.setDescription(c.getDescription());
            catRepository.save(Catégorie);
        });}


    @Override
    public Catégorie deleteCatByID(long id) {
        return null;
    }

    @Override
    public List<Catégorie> getCatByNomProduit() {
        return List.of();
    }
}
