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
@Table(name = "tempmedie")

public class Tempmedie implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //float
    @Column(name="medie")
    private Float medie;

    //varchar(100)
    @Column(name="nume", length = 100)
    private String nume;

    //bigint
    @Column(name="id_stud")
    private Long id_stud;

    //int
    @Column(name="credite")
<<<<<<< HEAD
    private int credite;

    //float(4,2)
    @Column(name="m1")
    private float m1;

    //float(4,2)
    @Column(name="m2")
    private float m2;

    //float(4,2)
    @Column(name="m3")
    private float m3;

    //float(4,2)
    @Column(name="m4")
    private float m4;

    //float(4,2)
    @Column(name="c1")
    private float c1;

    //float(4,2)
    @Column(name="c2")
    private float c2;

    //float(4,2)
    @Column(name="c3")
    private float c3;

    //float(4,2)
    @Column(name="c4")
    private float c4;
=======
    private Integer credite;

    //float(4,2)
    @Column(name="m1")
    private Float m1;

    //float(4,2)
    @Column(name="m2")
    private Float m2;

    //float(4,2)
    @Column(name="m3")
    private Float m3;

    //float(4,2)
    @Column(name="m4")
    private Float m4;

    //float(4,2)
    @Column(name="c1")
    private Float c1;

    //float(4,2)
    @Column(name="c2")
    private Float c2;

    //float(4,2)
    @Column(name="c3")
    private Float c3;

    //float(4,2)
    @Column(name="c4")
    private Float c4;
>>>>>>> 00ba1cb7ae9e2656391b506277d742fec6e53dad

    //varchar(10)
    @Column(name="initiale", length = 10)
    private String initiale;
}