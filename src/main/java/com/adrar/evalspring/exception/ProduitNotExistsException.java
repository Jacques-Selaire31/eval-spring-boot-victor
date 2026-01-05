package com.adrar.evalspring.exception;

public class ProduitNotExistsException extends RuntimeException {
  public ProduitNotExistsException(String message) {
    super(message);
  }
}
