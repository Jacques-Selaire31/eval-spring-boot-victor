package com.adrar.evalspring.exception;

import com.adrar.evalspring.entity.Produit;

public class ProduitAllReadyExistsException extends RuntimeException {

    public ProduitAllReadyExistsException(String message) {
            super(message);
        }
}
