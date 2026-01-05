package com.adrar.evalspring.repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

import com.adrar.evalspring.entity.Produit;

public interface ProduitRepository extends CrudRepository<Produit, Integer>
{
    public boolean existsByName(String nom);
}
