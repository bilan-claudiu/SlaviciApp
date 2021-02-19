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

    //time
    @Column(name="timemod")
    private Time timemod;

    //date
    @Column(name="datamod")
    private Date datamod;
}