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
@Table(name = "confani")
public class Confani implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //(GenerationType.IDENTITY???)
    @Column(name="idmaterie")
    private Long idmaterie;

    //lung. max 20 caract.(GenerationType.IDENTITY???)
    @Column(name="promotie", length = 20)
    private String promotie;

    //lung. max 3 caract.
    @Column(name="specializare", length = 3)
    private String specializare;

    @Column(name="anstudiu")
    private Integer anstudiu;

    @Column(name="semestru")
    private Integer semestru;

    @Column(name="tipdisciplina")
    private Integer tipdisciplina;

    @Column(name="formaex")
    private Integer formaex;

    @Column(name="credite")
    private Integer credite;

    //ce functie apelez pentru "blob"????
    @Column(name="observatii")
    private String observatii;

    @Column(name="iduser")
    private Long iduser;

    //ce functie apelez pentru "time"????
    @Column(name="timemod")
    private String timemod;

    //ce functie apelez pentru "data"????
    @Column(name="datamod")
    private String datamod;
}