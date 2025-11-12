package com.gestion_produits.projet1.services.FichierStock;

import com.gestion_produits.projet1.entities.FichierStock;
import com.gestion_produits.projet1.repos.FichierStockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class FichierServiceImp implements FichierService {
    @Autowired
    FichierStockRepository fichierStockRepository;
    @Override
    public FichierStock findById(long id) {
        return fichierStockRepository.findById(id).get();
    }

    @Override
    public void updateFichier(FichierStock fichierStock,long id) {
        fichierStockRepository.findById(id).ifPresent(f->{
            f.setProduit(f.getProduit());
            f.setDateMàj(f.getDateMàj());
            f.setQuantite(f.getQuantite());
            fichierStockRepository.save(f);
        });
    }

    @Override
    public void deleteFichier(long id) {
        fichierStockRepository.deleteById(id);
    }

    @Override
    public List<FichierStock> findAll() {
        return fichierStockRepository.findAll();
    }
}
