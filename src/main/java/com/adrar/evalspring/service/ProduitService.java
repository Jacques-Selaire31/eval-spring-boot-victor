package com.adrar.evalspring.service;


import com.adrar.evalspring.entity.Produit;
import com.adrar.evalspring.exception.ProduitAllReadyExistsException;
import com.adrar.evalspring.exception.ProduitNotExistsException;
import com.adrar.evalspring.exception.ProduitsNotFoundException;
import com.adrar.evalspring.repository.ProduitRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ProduitService {
    private ProduitRepository produitRepository;

    //Ajouter un produit
    public Produit addProduit(Produit produit){
        if (produitRepository.existsByNom(produit.getNom())) {
            throw new ProduitAllReadyExistsException("Le produit avec le nom suivant : " + produit.getNom() + " existe déjà");
        }
        return produitRepository.save(produit);
    }
    //Récuperer tous les produits
    public List<Produit> getAllProduit()
    {
        if (produitRepository.count() == 0) {
            throw new ProduitsNotFoundException("La liste des produits est vide");
        }
        return (List<Produit>) produitRepository.findAll();
    }

    //Récuperer via ID
    public Optional<Produit> getProduitById(Integer id)
    {
        return Optional
                .of(produitRepository
                        .findById(id)
                        .orElseThrow(
                                ()-> new ProduitNotExistsException("Le produit avec id :" + id +  " n'existe pas")
                        )
                );
    }
}
