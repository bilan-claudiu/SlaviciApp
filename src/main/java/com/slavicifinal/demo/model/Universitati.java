package com.slavicifinal.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
<<<<<<< HEAD
<<<<<<< HEAD
=======
import org.apache.tomcat.jni.Address;
>>>>>>> 00ba1cb7ae9e2656391b506277d742fec6e53dad
=======
import org.apache.tomcat.jni.Address;
>>>>>>> 3fc1a16bc4db8e6e1b6dcfd0f3770119c61adc39

import javax.persistence.*;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "universitati")

public class Universitati implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //varchar(50)
    @Column(name="nume", length = 50)
    private String nume;

    //varchar(30)
    @Column(name="pag1", length = 30)
    private String pag1;

    //varchar(30)
    @Column(name="pag2", length = 30)
    private String pag2;

    //varchar(30)
    @Column(name="pag3", length = 30)
    private String pag3;

    //varchar(30)
    @Column(name="pag4", length = 30)
    private String pag4;

    //varchar(50)
    @Column(name="adeverinta", length = 50)
    private String adeverinta;

    //varchar(50)
    @Column(name="certificat", length = 50)
<<<<<<< HEAD
<<<<<<< HEAD
    private String certificat;
=======
    private Integer certificat;
>>>>>>> 00ba1cb7ae9e2656391b506277d742fec6e53dad
=======
    private Integer certificat;
>>>>>>> 3fc1a16bc4db8e6e1b6dcfd0f3770119c61adc39

    //varchar(50)
    @Column(name="coperta", length = 50)
    private String coperta;

    //varchar(50)
    @Column(name="pag5", length = 50)
    private String pag5;

    //varchar(50)
    @Column(name="pag6", length = 50)
    private String pag6;

    //varchar(50)
    @Column(name="pag7", length = 50)
    private String pag7;

    //varchar(30)
    @Column(name="sitp1", length = 30)
    private String sitp1;


    //varchar(30)
    @Column(name="sitp2", length = 30)
    private String sitp2;

    //varchar(30)
    @Column(name="sitp3", length = 30)
    private String sitp3;

    //varchar(30)
    @Column(name="sitp4", length = 30)
    private String sitp4;

    //varchar(30)
    @Column(name="sitp5", length = 30)
    private String sitp5;


    //varchar(30)
    @Column(name="sitp6", length = 30)
    private String sitp6;

    //varchar(30)
    @Column(name="sitp7", length = 30)
    private String sitp7;

    //int
    @Column(name="specializarea")
<<<<<<< HEAD
<<<<<<< HEAD
    private int specializarea;
=======
    private Integer specializarea;
>>>>>>> 00ba1cb7ae9e2656391b506277d742fec6e53dad
=======
    private Integer specializarea;
>>>>>>> 3fc1a16bc4db8e6e1b6dcfd0f3770119c61adc39

    //varchar(50)
    @Column(name="numespec", length = 50)
    private String numespec;

    //varchar(50)
    @Column(name="numespecen", length = 50)
<<<<<<< HEAD
<<<<<<< HEAD
    private String numespecen;
=======
=======
>>>>>>> 3fc1a16bc4db8e6e1b6dcfd0f3770119c61adc39
    private Integer numespecen;


    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "iduniversitate")
    private Absolventi absolventi;
<<<<<<< HEAD
>>>>>>> 00ba1cb7ae9e2656391b506277d742fec6e53dad
=======
>>>>>>> 3fc1a16bc4db8e6e1b6dcfd0f3770119c61adc39
}