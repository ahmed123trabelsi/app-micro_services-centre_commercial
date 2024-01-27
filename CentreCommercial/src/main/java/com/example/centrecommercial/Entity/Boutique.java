package com.example.centrecommercial.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Setter
@Getter
public class Boutique implements Serializable {
    @JsonProperty("idBoutique")
    private int idBoutique;
    String nom ;

    String adresse ;

    @Enumerated(EnumType.STRING)
    TypeBoutique typeBoutique ;

    @Enumerated(EnumType.STRING)
    Categorie categorie ;

    String numTel ;
    Long idCentre;
}
