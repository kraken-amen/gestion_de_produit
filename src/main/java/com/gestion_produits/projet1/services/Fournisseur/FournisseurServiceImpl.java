package com.gestion_produits.projet1.services.Fournisseur;

import com.gestion_produits.projet1.entities.Fournisseur;
import com.gestion_produits.projet1.entities.Produit;
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
    public Fournisseur updateFournisseur(Fournisseur f) {
        Optional<Fournisseur> fournisseurf = fournisseurRepository.findById(f.getId());
        if (fournisseurf.isPresent()) {
            fournisseurf.get().setNom(f.getNom());
            fournisseurf.get().setEmail(f.getEmail());
        }
        return fournisseurRepository.save(f);
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
