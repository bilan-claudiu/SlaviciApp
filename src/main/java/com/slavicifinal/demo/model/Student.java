package com.slavicifinal.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "studenti2")
public class Student {



    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;

    @Column(name="an_univ")
    private int an;

    @Column(name="nume")
    private String nume;

    @Column(name="prenume")
    private String prenume;


    @Column(name="specializare")
    private String specializare;

    @Column(name="CNP")
    private String CNP;

    @Column(name="email")
    private String email;

    @Column(name="parola")
    private String parola;



}