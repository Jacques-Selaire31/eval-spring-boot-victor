package com.adrar.evalspring.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

@Entity
@Table(name="produit")
@Data
public class Produit {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;

    @Column(name ="nom", nullable = false)
    @Length(min = 2, message = "Le nom du produit doit contenir au moins 2 charactères")
    @NotBlank(message = "Le titre ne peut pas être vide")
    private String nom;

    @Column(name ="prix", nullable = false)
    @NotBlank(message = "Le prix ne peut pas être vide")
    @Positive(message = "Le prix ne peut pas être négatif")
    private Double prix;
}
