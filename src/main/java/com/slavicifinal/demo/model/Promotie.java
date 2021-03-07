package com.slavicifinal.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "promotie")
public class Promotie implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //lung max 50 caract.
<<<<<<< HEAD
<<<<<<< HEAD
    @Column(name="nume", length = 50)
    private String nume;
=======

    @Column(name="nume", length = 50)
    private int nume;
>>>>>>> 00ba1cb7ae9e2656391b506277d742fec6e53dad
=======

    @Column(name="nume", length = 50)
    private int nume;
>>>>>>> 3fc1a16bc4db8e6e1b6dcfd0f3770119c61adc39

}