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
@Table(name = "nstudenti")
public class Nstudenti implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //lung. max 20 caract.
    @Column(name="nnastere", length = 20)
    private String nnastere;

    //lung. max 20 caract.
    @Column(name="nactual", length = 20)
    private String nactual;

    //lung. max 25 caract.
    @Column(name="prenume", length = 25)
    private String prenume;

    //lung. max 10 caract.
    @Column(name="nr_mat", length = 10)
    private String nr_mat;

    //lung. max 2 caract.
    @Column(name="specializare", length = 2)
    private String specializare;



}