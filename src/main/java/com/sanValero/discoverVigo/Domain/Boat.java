package com.sanValero.discoverVigo.Domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity (name = "boat")
public class Boat {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long id;
    @Column
    private String name;
    @Column
    private String matricula;
    @Column
    private double price;
    @Column
    private boolean lunch;
    @Column
    private boolean available;



}
