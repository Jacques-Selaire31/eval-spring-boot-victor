package com.adrar.evalspring.controller;

import com.adrar.evalspring.exception.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class ExceptionController {

    @ExceptionHandler(ProduitsNotFoundException.class)
    public ResponseEntity<Map<String, String>> handleProduitsNotFoundException(ProduitsNotFoundException ex)
    {
        Map<String, String> response = new HashMap<>();
        response.put("Error", ex.getMessage());
        return ResponseEntity
                .status(HttpStatus.ACCEPTED)
                .body(response);
    }
    @ExceptionHandler(ProduitAllReadyExistsException.class)
    public ResponseEntity<Map<String, String>> handleProduitAllReadyExistsException(ProduitAllReadyExistsException ex)
    {
        Map<String, String> response = new HashMap<>();
        response.put("Error", ex.getMessage());
        return ResponseEntity
                .status(HttpStatus.BAD_REQUEST)
                .body(response);
    }

    @ExceptionHandler(ProduitNotExistsException.class)
    public ResponseEntity<Map<String, String>> handleProduitNotExistsException(ProduitNotExistsException ex)
    {
        Map<String, String> response = new HashMap<>();
        response.put("Error", ex.getMessage());
        return ResponseEntity
                .status(HttpStatus.PARTIAL_CONTENT)
                .body(response);
    }

    @ExceptionHandler(CategoriesNotFoundException.class)
    public ResponseEntity<Map<String, String>> handleCategoriesNotFoundException(CategoriesNotFoundException ex)
    {
        Map<String, String> response = new HashMap<>();
        response.put("Error", ex.getMessage());
        return ResponseEntity
                .status(HttpStatus.ACCEPTED)
                .body(response);
    }
    @ExceptionHandler(CategorieAllReadyExistsException.class)
    public ResponseEntity<Map<String, String>> handleCategorieAllReadyExistsException(CategorieAllReadyExistsException ex)
    {
        Map<String, String> response = new HashMap<>();
        response.put("Error", ex.getMessage());
        return ResponseEntity
                .status(HttpStatus.BAD_REQUEST)
                .body(response);
    }

    @ExceptionHandler(CategorieNotExistsException.class)
    public ResponseEntity<Map<String, String>> handleCategorieNotExistsException(CategorieNotExistsException ex)
    {
        Map<String, String> response = new HashMap<>();
        response.put("Error", ex.getMessage());
        return ResponseEntity
                .status(HttpStatus.PARTIAL_CONTENT)
                .body(response);
    }
}
