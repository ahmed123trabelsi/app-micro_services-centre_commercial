package com.example.boutique.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class FullBoutiqueResponse {
    String nom ;
    String adresse ;
//    @Enumerated(EnumType.STRING)
//    TypeBoutique typeBoutique ;
//    @Enumerated(EnumType.STRING)
//    Categorie categorie ;
//    @JsonProperty("numTel")
//    String numTel ;
    List <Produit> produits ;
}
