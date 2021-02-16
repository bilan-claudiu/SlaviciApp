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
    private Float notaf;

    //float(5.2)??
    @Column(name="notaa")
    private Float notaa;

    //float(5.2)??
    @Column(name="notac")
    private Float notac;

    @Column(name="iduser")
    private Integer iduser;

    //ce functie apelez pentru "time"????
    @Column(name="timemod")
    private String timemod;

    //ce functie apelez pentru "data"????
    @Column(name="datamod")
    private String datamod;


}