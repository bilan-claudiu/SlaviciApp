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
@Table(name = "studenti")
public class Student implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="an_univ")
    private Integer an;

    @Column(name="nume")
    private String name;

    @Column(name="prenume")
    private String prenume;


    @Column(name="specializare")
    private String specializare;

    @Column(name="CNP")
    private Long CNP;

    @Column(name="email")
    private String email;

    @Column(name="parola")
    private String parola;
}