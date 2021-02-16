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
@Table(name = "materie")
public class Materie implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //lung. max 15 caract.
    @Column(name="cod_mat")
    private String cod_mat;

    //lung. max 50 caract.
    @Column(name="denum_mat")
    private String denum_mat;

    //lung. max 5 caract.
    @Column(name="orecurs")
    private String orecurs;

    //lung. max 5 caract.
    @Column(name="oresem")
    private String oresem;

    //lung. max 5 caract.
    @Column(name="orelab")
    private String orelab;

    //lung. max 5 caract.
    @Column(name="orepgr")
    private String orepgr;

    //lung. max 5 caract.
    @Column(name="orepractica")
    private String orepractica;

    @Column(name="iduser")
    private Long iduser;

    //ce functie apelez pentru "time"????
    @Column(name="timemod")
    private String timemod;

    //ce functie apelez pentru "data"????
    @Column(name="datamod")
    private String datamod;
}