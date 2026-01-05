package com.adrar.evalspring.repository;

import com.adrar.evalspring.entity.Categorie;
import org.springframework.data.repository.CrudRepository;

public interface CategorieRepository  extends CrudRepository<Categorie, Integer> {
    public boolean existsByLibele(String libele);
}
