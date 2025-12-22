package com.example.voiture.entities;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.beans.Transient;

@Entity
@Data
@NoArgsConstructor
public class Voiture {

    @Id
    @GeneratedValue
    private Long id;
    private String marque;
    private String matricule;
    private String model;
    private Long idClient;

    public Voiture(Long id, String marque, String matricule, String model, Long clientId) {
        this.id = id;
        this.marque = marque;
        this.matricule = matricule;
        this.model = model;
        this.idClient = clientId;
    }
}
