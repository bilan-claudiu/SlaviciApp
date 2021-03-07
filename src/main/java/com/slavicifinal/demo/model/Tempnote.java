package com.slavicifinal.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;
import java.sql.Time;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tempnote")

public class Tempnote implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //bigint
    @Column(name="idstud")
    private Long idstud;

    //bigint
    @Column(name="idconfani")
    private Long idconfani;

    //float(5,2)
    @Column(name="notaf")
<<<<<<< HEAD
<<<<<<< HEAD
    private float notaf;

    //float(5,2)
    @Column(name="notaa")
    private float notaa;

    //float(5,2)
    @Column(name="notac")
    private float notac;

    //int
    @Column(name="iduser")
    private int iduser;
=======
=======
>>>>>>> 3fc1a16bc4db8e6e1b6dcfd0f3770119c61adc39
    private Float notaf;

    //float(5,2)
    @Column(name="notaa")
    private Float notaa;

    //float(5,2)
    @Column(name="notac")
    private Float notac;

    //int
    @Column(name="iduser")
    private Integer iduser;
<<<<<<< HEAD
>>>>>>> 00ba1cb7ae9e2656391b506277d742fec6e53dad
=======
>>>>>>> 3fc1a16bc4db8e6e1b6dcfd0f3770119c61adc39

    //time
    @Column(name="timemod")
    private Time timemod;

    //date
    @Column(name="datamod")
    private Date datamod;
}