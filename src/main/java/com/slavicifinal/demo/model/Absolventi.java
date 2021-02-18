package com.slavicifinal.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "absolventi")
public class Absolventi implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="id_stud")
    private Long id_stud;

    @Column(name="idpromotie")
    private Long idpromotie;

    //lungimea max 30 de caractere
    @Column(name="nume", length = 30)
    private String nume;

    //lungimea max 30 de caractere
    @Column(name="numenastere", length = 30)
    private String numenastere;

    //lungimea max 20 de caractere
    @Column(name="initiale", length = 20)
    private String initiale;

    //lungimea de max 50 caractere
    @Column(name="tata", length = 50)
    private String tata;

    //lungimea max 50 de caractere
    @Column(name="mama", length = 50)
    private String mama;

    @Column(name="datanastere")
    private Date datanastere;

    //lungimea max 35 de caractere
    @Column(name="locnastere", length = 35)
    private String locnastere;

    //lungimea max 15 caractere
    @Column(name="nr_mat", length = 15)
    private int nr_mat;

    //lungimea max 20 caractere
    @Column(name="an_volum", length = 20)
    private int an_volum;

    //lungimea max 20 caractere
    @Column(name="cnp", length = 20)
    private String cnp;

    //lungimea max 20 caractere
    @Column(name="promotia", length = 20)
    private String promotia;

    //lungimea max 10 caractere
    @Column(name="volumul", length = 10)
    private short volumul;

    //lungimea max 20 caractere
    @Column(name="anul1", length = 20)
    private String anul1;

    //lungimea max 20 caractere
    @Column(name="anul2", length = 20)
    private String anul2;

    //lungimea max 20 caractere
    @Column(name="anul3", length = 20)
    private String anul3;

    //lungimea max 20 caractere
    @Column(name="anul4", length = 20)
    private String anul4;

    //lungimea max 20 caractere
    @Column(name="anul5", length = 20)
    private String anul5;

    @Column(name="media")
    private float media;

    @Column(name="sexul")
    private char sexul;

    @Column(name="credite")
    private short credite;

    @Column(name="totalpromotie")
    private int totalpromotie;

    @Column(name="pozpromotie")
    private int pozpromotie;

    //lungimea max 30 caractere
    @Column(name="prenume", length = 30)
    private String prenume;

    //lungimea max 20 caractere
    @Column(name="anfinal", length = 20)
    private String anfinal;

    @Column(name="iduniversitate")
    private Long iduniversitate;

    //tinyblob???
    @Column(name="observatii")
    private String observatii;

    @Column(name="licenta")
    private String licenta;

    //float(4.2)
    @Column(name="m1")
    private float m1;

    //float(4.2)
    @Column(name="m2")
    private float m2;

    //float(4.2)
    @Column(name="m3")
    private float m3;

    //float(4.2)
    @Column(name="m4")
    private float m4;

    //float(4.2)
    @Column(name="c1")
    private float c1;

    //float(4.2)
    @Column(name="c2")
    private float c2;

    //float(4.2)
    @Column(name="c3")
    private float c3;

    //float(4.2)
    @Column(name="c4")
    private float c4;






}