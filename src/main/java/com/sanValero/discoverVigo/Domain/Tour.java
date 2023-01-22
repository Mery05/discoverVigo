package com.sanValero.discoverVigo.Domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity (name = "tour")
public class Tour {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long id;
    @Column
    private String name;
    @Column
    private boolean available;
    @Column
    private double price;
    @Column
    private boolean lunch;
    @Column
    private int capacidad;

}
