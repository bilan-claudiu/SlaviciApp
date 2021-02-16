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
    @Column(name="nume")
    private String nume;

    //lungimea max 30 de caractere
    @Column(name="numenastere")
    private String numenastere;

    //lungimea max 20 de caractere
    @Column(name="initiale")
    private String initiale;

    //lungimea de max 50 caractere
    @Column(name="tata")
    private String tata;

    //lungimea max 50 de caractere
    @Column(name="mama")
    private String mama;

    @Column(name="datanastere")
    private String datanastere;

    //lungimea max 35 de caractere
    @Column(name="locnastere")
    private String locnastere;

    //lungimea max 15 caractere
    @Column(name="nr_mat")
    private String nr_mat;

    //lungimea max 20 caractere
    @Column(name="an_volum")
    private String an_volum;

    //lungimea max 20 caractere
    @Column(name="cnp")
    private String cnp;

    //lungimea max 20 caractere
    @Column(name="promotia")
    private String promotia;

    //lungimea max 10 caractere
    @Column(name="volumul")
    private String volumul;

    //lungimea max 20 caractere
    @Column(name="anul1")
    private String anul1;

    //lungimea max 20 caractere
    @Column(name="anul2")
    private String anul2;

    //lungimea max 20 caractere
    @Column(name="anul3")
    private String anul3;

    //lungimea max 20 caractere
    @Column(name="anul4")
    private String anul4;

    //lungimea max 20 caractere
    @Column(name="anul5")
    private String anul5;

    @Column(name="media")
    private Float media;

    @Column(name="sexul")
    private Integer sexul;

    @Column(name="credite")
    private Integer credite;

    @Column(name="totalpromotie")
    private Integer totalpromotie;

    @Column(name="pozpromotie")
    private Integer pozpromotie;

    //lungimea max 30 caractere
    @Column(name="prenume")
    private String prenume;

    //lungimea max 20 caractere
    @Column(name="anfinal")
    private String anfinal;

    @Column(name="iduniversitate")
    private Long iduniversitate;

    //tinyblob???
    @Column(name="observatii")
    private String observatii;

    @Column(name="licenta")
    private Float licenta;

    //float(4.2)
    @Column(name="m1")
    private Float m1;

    //float(4.2)
    @Column(name="m2")
    private Float m2;

    //float(4.2)
    @Column(name="m3")
    private Float m3;

    //float(4.2)
    @Column(name="m4")
    private Float m4;

    //float(4.2)
    @Column(name="c1")
    private Float c1;

    //float(4.2)
    @Column(name="c2")
    private Float c2;

    //float(4.2)
    @Column(name="c3")
    private Float c3;

    //float(4.2)
    @Column(name="c4")
    private Float c4;






}