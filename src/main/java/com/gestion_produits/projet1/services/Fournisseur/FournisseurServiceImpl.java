package com.gestion_produits.projet1.services.Fournisseur;

import com.gestion_produits.projet1.entities.Fournisseur;
import com.gestion_produits.projet1.repos.FournisseurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FournisseurServiceImpl implements FournisseurService {
    @Autowired
    FournisseurRepository fournisseurRepository;
    @Override
    public Fournisseur saveFournisseur(Fournisseur f) {
        return fournisseurRepository.save(f);
    }
    @Override
    public Fournisseur getFournisseurById(Long id) {
        return fournisseurRepository.findById(id).get();
    }

    @Override
    public void updateFournisseur(Fournisseur f, long id) {
        fournisseurRepository.findById(id).ifPresent(f1 -> {
        f1.setNom(f.getNom());
        f1.setEmail(f.getEmail());
        fournisseurRepository.save(f1);
        });
    }

    @Override
    public void deleteFournisseur(Fournisseur f) {
        fournisseurRepository.delete(f);
    }

    @Override
    public void deleteFournisseurById(long id) {
        fournisseurRepository.deleteById(id);
    }

    @Override
    public List<Fournisseur> findAllFournisseur() {
        return fournisseurRepository.findAll();
    }
}
