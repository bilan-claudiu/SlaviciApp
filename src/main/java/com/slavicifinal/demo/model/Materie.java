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
    @Column(name="cod_mat", length = 15)
    private String cod_mat;

    //lung. max 50 caract.
    @Column(name="denum_mat", length = 50)
    private String denum_mat;

    //lung. max 5 caract.
    @Column(name="orecurs", length = 5)
    private String orecurs;

    //lung. max 5 caract.
    @Column(name="oresem", length = 5)
    private String oresem;

    //lung. max 5 caract.
    @Column(name="orelab", length = 5)
    private String orelab;

    //lung. max 5 caract.
    @Column(name="orepgr", length = 5)
    private String orepgr;

    //lung. max 5 caract.
    @Column(name="orepractica", length = 5)
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