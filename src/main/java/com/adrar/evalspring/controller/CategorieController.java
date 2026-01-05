package com.adrar.evalspring.controller;

import com.adrar.evalspring.entity.Categorie;
import com.adrar.evalspring.service.CategorieService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
public class CategorieController {

    private CategorieService categorieService;

    @GetMapping("/categorie/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Optional<Categorie> getCategorie(@PathVariable Integer id)
    {
        return categorieService.getCategorieById(id);
    }

    @GetMapping("/categories")
    @ResponseStatus(HttpStatus.OK)
    public List<Categorie> getCategories()
    {
        return  categorieService.getAllCategorie();
    }
    @PostMapping("/categorie")
    @ResponseStatus(HttpStatus.CREATED)
    public Categorie createCategorie(@RequestBody Categorie categorie)
    {
        return categorieService.addCategorie(categorie);
    }
}