package com.sanValero.discoverVigo.Domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity (name = "supleir")
public class Suppleir {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long id;
}
