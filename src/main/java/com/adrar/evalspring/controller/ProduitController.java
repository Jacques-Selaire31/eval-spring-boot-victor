package com.adrar.evalspring.controller;

import com.adrar.evalspring.entity.Produit;
import com.adrar.evalspring.service.ProduitService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
public class ProduitController {

    private ProduitService produitService;

    @GetMapping("/produit/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Optional<Produit> getProduit(@PathVariable Integer id)
    {
        return produitService.getProduitById(id);
    }

    @GetMapping("/produits")
    @ResponseStatus(HttpStatus.OK)
    public List<Produit> getProduits()
    {
        return  produitService.getAllProduit();
    }
    @PostMapping("/produit")
    @ResponseStatus(HttpStatus.CREATED)
    public Produit createProduit(@RequestBody Produit produit)
    {
        return produitService.addProduit(produit);
    }
}
