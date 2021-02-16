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
    @Column(name="nnastere")
    private String nnastere;

    //lung. max 20 caract.
    @Column(name="nactual")
    private String nactual;

    //lung. max 25 caract.
    @Column(name="prenume")
    private String prenume;

    //lung. max 10 caract.
    @Column(name="nr_mat")
    private String nr_mat;

    //lung. max 2 caract.
    @Column(name="specializare")
    private String specializare;

}