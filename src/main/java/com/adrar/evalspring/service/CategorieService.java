package com.adrar.evalspring.service;
import com.adrar.evalspring.entity.Categorie;
import com.adrar.evalspring.exception.*;
import com.adrar.evalspring.repository.CategorieRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class CategorieService {
    private CategorieRepository categorieRepository;

    //Ajouter un produit
    public Categorie addCategorie(Categorie categorie){
        if (categorieRepository.existsByLibele(categorie.getLibele())) {
            throw new CategorieAllReadyExistsException("La categorie avec le libele suivant : " + categorie.getLibele() + " existe déjà");
        }
        return categorieRepository.save(categorie);
    }
    //Récuperer tous les produits
    public List<Categorie> getAllCategorie()
    {
        if (categorieRepository.count() == 0) {
            throw new CategoriesNotFoundException("La liste des categories est vide");
        }
        return (List<Categorie>) categorieRepository.findAll();
    }

    //Récuperer via ID
    public Optional<Categorie> getCategorieById(Integer id)
    {
        return Optional
                .of(categorieRepository
                        .findById(id)
                        .orElseThrow(
                                ()-> new CategorieNotExistsException("La categorie avec id :" + id +  " n'existe pas")
                        )
                );
    }
}
