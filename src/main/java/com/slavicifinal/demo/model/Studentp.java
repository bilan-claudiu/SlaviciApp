package com.slavicifinal.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Time;
import java.sql.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "studentp")

public class Studentp implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //varchar(30)
    @Column(name="nnastere", length = 30)
    private String nnastere;

    //varchar(30)
    @Column(name="nactual", length = 30)
    private String nactual;

    //varchar(30)
    @Column(name="prenume", length = 30)
    private String prenume;

    //varchar(30)
    @Column(name="pmama", length = 30)
    private String pmama;

    //varchar(30)
    @Column(name="ptata", length = 30)
    private String ptata;

    //varchar(20)
    @Column(name="cnp", length = 20)
    private String cnp;

    // date
    @Column(name="dnastere")
    private Date dnastere;

    // varchar(25)
    @Column(name="tnastere", length = 25)
    private String tnastere;

    //varchar(25)
    @Column(name="lnastere", length = 25)
    private String lnastere;

    //varchar(40)
    @Column(name="jnastere", length = 40)
    private String jnastere;

<<<<<<< HEAD
<<<<<<< HEAD
    //char
    @Column(name="sexul")
    private char sexul;
=======
    //int
    @Column(name="sexul")
    private int sexul;
>>>>>>> 00ba1cb7ae9e2656391b506277d742fec6e53dad
=======
    //int
    @Column(name="sexul")
    private int sexul;
>>>>>>> 3fc1a16bc4db8e6e1b6dcfd0f3770119c61adc39

    //varchar(15)
    @Column(name="civila", length = 15)
    private String civila;

    // varchar(50)
    @Column(name="social", length = 50)
    private String social;

    // varchar(40)
    @Column(name="cetatenie", length = 40)
    private String cetatenie;

    // varchar(40)
    @Column(name="nationalitate", length = 40)
    private String nationalitate;

    //tinyint(1)
    @Column(name="stagiumilitar")
<<<<<<< HEAD
<<<<<<< HEAD
    private short stagiumilitar;
=======
    private Boolean stagiumilitar;
>>>>>>> 00ba1cb7ae9e2656391b506277d742fec6e53dad
=======
    private Boolean stagiumilitar;
>>>>>>> 3fc1a16bc4db8e6e1b6dcfd0f3770119c61adc39

    //varchar(40)
    @Column(name="etnie", length = 40)
    private String etnie;

    //varchar(40)
    @Column(name="domiciliul", length = 40)
    private String domiciliul;

    // varchar(25)
    @Column(name="domiciliuj", length = 25)
    private String domiciliuj;

    // varchar(25)
    @Column(name="domiciliut", length = 25)
    private String domiciliut;

    // varchar(35)
    @Column(name="domiciliua", length = 35)
    private String domiciliua;

    // varchar(10)
    @Column(name="domiciliuc", length = 10)
    private String domiciliuc;

    // varchar(10)
    @Column(name="serieid", length = 10)
    private String serieid;

    // varchar(15)
    @Column(name="nrid", length = 15)
    private String nrid;

    // varchar(20)
    @Column(name="tipid", length = 20)
    private String tipid;

    // varchar(50)
    @Column(name="eliberatid", length = 50)
    private String eliberatid;

    // date
    @Column(name="dataelid")
    private Date dataelid;

    // date
    @Column(name="dataexpid")
    private Date dataexpid;

    // varchar(30)
    @Column(name="telefon", length = 30)
    private String telefon;

    // varchar(50)
    @Column(name="informare", length = 50)
    private String informare;

    // varchar(50)
    @Column(name="work", length = 50)
    private String work;

    // varchar(35)
    @Column(name="email", length = 35)
    private String email;

    // varchar(50)
    @Column(name="dezabilitati", length = 50)
    private String dezabilitati;

    // varchar(25)
    @Column(name="liceu_localit", length = 25)
    private String liceu_localit;

    // varchar(25)
    @Column(name="liceu_tara", length = 25)
    private String liceu_tara;

    // varchar(25)
    @Column(name="liceu_judet", length = 25)
    private String liceu_judet;

    // varchar(50)
    @Column(name="liceu_profil", length = 50)
    private String liceu_profil;

    // varchar(20)
    @Column(name="liceu_durata", length = 20)
    private String liceu_durata;

    // varchar(20)
    @Column(name="liceu_anabs", length = 20)
    private String liceu_anabs;

    // varchar(25)
    @Column(name="liceu_forma", length = 25)
    private String liceu_forma;

    // varchar(50)
    @Column(name="liceu_diploma", length = 50)
    private String liceu_diploma;

    // varchar(25)
    @Column(name="liceu_serie", length = 25)
    private String liceu_serie;

    // varchar(25)
    @Column(name="liceu_numar", length = 25)
    private String liceu_numar;

    // varchar(40)
    @Column(name="liceu_emis", length = 40)
    private String liceu_emis;

    // varchar(5)
    @Column(name="liceu_anemis", length = 5)
    private String liceu_anemis;

    // varchar(15)
    @Column(name="liceu_matricola", length = 15)
    private String liceu_matricola;

    // varchar(30)
    @Column(name="liceu_vizare", length = 30)
    private String liceu_vizare;

    // float(5,2)
    @Column(name="liceu_bac")
<<<<<<< HEAD
<<<<<<< HEAD
    private float liceu_bac;

    // float(5,2)
    @Column(name="liceu_media")
    private float liceu_media;

    // varchar(25)
    @Column(name="univ_tara", length = 25)
    private float univ_tara;
=======
=======
>>>>>>> 3fc1a16bc4db8e6e1b6dcfd0f3770119c61adc39
    private Float liceu_bac;

    // float(5,2)
    @Column(name="liceu_media")
    private Float liceu_media;

    // varchar(25)
    @Column(name="univ_tara", length = 25)
    private String univ_tara;
<<<<<<< HEAD
>>>>>>> 00ba1cb7ae9e2656391b506277d742fec6e53dad
=======
>>>>>>> 3fc1a16bc4db8e6e1b6dcfd0f3770119c61adc39

    // varchar(25)
    @Column(name="univ_localit", length = 25)
    private String univ_localit;

    // varchar(25)
    @Column(name="univ_judet", length = 25)
    private String univ_judet;

    // varchar(50)
    @Column(name="univ_denumire", length = 50)
    private String univ_denumire;

    // varchar(50)
    @Column(name="liceu_denumire", length = 50)
    private String liceu_denumire;

    // varchar(50)
    @Column(name="univ_facultate", length = 50)
    private String univ_facultate;

    // varchar(50)
    @Column(name="univ_domeniu", length = 50)
    private String univ_domeniu;

    // varchar(50)
    @Column(name="univ_specializare", length = 50)
    private String univ_specializare;

    // varchar(50)
    @Column(name="univ_titlu", length = 50)
    private String univ_titlu;

    // varchar(15)
    @Column(name="univ_forma", length = 15)
    private String univ_forma;

    // varchar(15)
    @Column(name="univ_taxa", length = 15)
    private String univ_taxa;

    // varchar(15)
    @Column(name="univ_durata", length = 15)
    private String univ_durata;

    // varchar(5)
    @Column(name="univ_anabs", length = 5)
    private String univ_anabs;

    // varchar(25)
    @Column(name="univ_diploma", length = 25)
    private String univ_diploma;

    // varchar(25)
    @Column(name="univ_serie", length = 25)
    private String univ_serie;

    // varchar(25)
    @Column(name="univ_numar", length = 25)
    private String univ_numar;

    // varchar(40)
    @Column(name="univ_emis", length = 40)
    private String univ_emis;

    // varchar(5)
    @Column(name="univ_anemis", length = 5)
    private String univ_anemis;

    // varchar(15)
    @Column(name="univ_matricola", length = 15)
    private String univ_matricola;

    // varchar(30)
    @Column(name="univ_vizare", length = 30)
    private String univ_vizare;

    // varchar(3)
    @Column(name="idspecializare", length = 3)
    private String idspecializare;

    // int
<<<<<<< HEAD
<<<<<<< HEAD
    @Column(name="forma", length = 30)
    private int forma;
=======
    @Column(name="forma")
    private Integer forma;
>>>>>>> 00ba1cb7ae9e2656391b506277d742fec6e53dad
=======
    @Column(name="forma")
    private Integer forma;
>>>>>>> 3fc1a16bc4db8e6e1b6dcfd0f3770119c61adc39

    // varchar(25)
    @Column(name="anpregatitor", length = 25)
    private String anpregatitor;

    // varchar(50)
    @Column(name="volumul", length = 50)
    private String volumul;

    // varchar(50)
    @Column(name="nr_mat", length = 50)
    private String nr_mat;

    // tinyint(1)
    @Column(name="exportweb")
<<<<<<< HEAD
<<<<<<< HEAD
    private short exportweb;
=======
    private Boolean exportweb;
>>>>>>> 00ba1cb7ae9e2656391b506277d742fec6e53dad
=======
    private Boolean exportweb;
>>>>>>> 3fc1a16bc4db8e6e1b6dcfd0f3770119c61adc39

    // varchar(20)
    @Column(name="promotia", length = 20)
    private String promotia;

    // varchar(25)
    @Column(name="poza", length = 25)
    private String poza;

    // mediumblob
    @Column(name="observatii")
    private String observatii;

    // bigint
    @Column(name="iduser")
<<<<<<< HEAD
<<<<<<< HEAD
    private long iduser;
=======
    private Long iduser;
>>>>>>> 00ba1cb7ae9e2656391b506277d742fec6e53dad
=======
    private Long iduser;
>>>>>>> 3fc1a16bc4db8e6e1b6dcfd0f3770119c61adc39

    // date
    @Column(name="datamod")
    private Date datamod;

    // time
    @Column(name="time")
    private Time time;

    //int
    @Column(name="tipstudent")
<<<<<<< HEAD
<<<<<<< HEAD
    private int tipstudent;
=======
    private Integer tipstudent;
>>>>>>> 00ba1cb7ae9e2656391b506277d742fec6e53dad
=======
    private Integer tipstudent;
>>>>>>> 3fc1a16bc4db8e6e1b6dcfd0f3770119c61adc39

}
