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
@Table(name = "transferuri")

public class Transferuri implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //varchar(20)
    @Column(name="promoties", length = 20)
    private String promoties;

    //varchar(20)
    @Column(name="promotief", length = 20)
    private String promotief;

    //int
    @Column(name="formas")
    private Integer formas;

    //int
    @Column(name="formaf")
<<<<<<< HEAD
    private int formaf;
=======
    private Integer formaf;
>>>>>>> 00ba1cb7ae9e2656391b506277d742fec6e53dad

    //varchar(3)
    @Column(name="idspecs", length = 3)
    private String idspecs;

    //varchar(3)
    @Column(name="idspecf", length = 3)
    private String idspecf;

    //date
    @Column(name="datamod")
    private Date datamod;

    //time
    @Column(name="timemod")
    private Time timemod;

    //int
    @Column(name="iduser")
<<<<<<< HEAD
    private int iduser;
=======
    private Integer iduser;
>>>>>>> 00ba1cb7ae9e2656391b506277d742fec6e53dad
}