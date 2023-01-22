package com.sanValero.discoverVigo.Domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Booking {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "start_date")
    @JsonFormat(pattern="dd-MM-yyyy")
    private LocalDate startDate;
    @Column(name = "end_date")
    @JsonFormat(pattern="dd-MM-yyyy")
    private LocalDate endDate;
    @Column
    private double price;

}
