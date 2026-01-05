package com.adrar.evalspring.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

@Entity
@Table(name="categorie")
@Data
public class Categorie {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;

    @Column(name ="libele", nullable = false)
    @Length(min = 2, message = "Le libele de la categorie doit contenir au moins 2 charactères")
    @NotBlank(message = "Le libele ne peut pas être vide")
    private String libele;
}
