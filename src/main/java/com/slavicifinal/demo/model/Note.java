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
@Table(name = "note")
public class Note implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="idstud")
    private Long idstud;

    @Column(name="idconfani")
    private Long idconfani;

    //float(5.2)??
    @Column(name="notaf")
    private float notaf;

    //float(5.2)??
    @Column(name="notaa")
    private float notaa;

    //float(5.2)??
    @Column(name="notac")
    private float notac;

    @Column(name="iduser")
    private int iduser;

    //ce functie apelez pentru "time"????
    @Column(name="timemod")
    private Time timemod;

    //ce functie apelez pentru "data"????
    @Column(name="datamod")
    private Date datamod;
<<<<<<< HEAD
=======


>>>>>>> 00ba1cb7ae9e2656391b506277d742fec6e53dad
}