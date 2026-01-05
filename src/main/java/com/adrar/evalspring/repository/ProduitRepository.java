package com.adrar.evalspring.repository;
import org.springframework.data.repository.CrudRepository;

import com.adrar.evalspring.entity.Produit;

public interface ProduitRepository extends CrudRepository<Produit, Integer>
{
    public boolean existsByNom(String nom);
}
