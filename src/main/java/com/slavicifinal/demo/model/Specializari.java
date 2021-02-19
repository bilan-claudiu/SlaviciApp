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
@Table(name = "specializari")
public class Specializari implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="idfacultate")
    private Long idfacultate;

    //lung. max 50 caract.
    @Column(name="nume", length = 50)
    private String nume;

    @Column(name="iduser")
    private Long iduser;

    //ce functie apelez pentru "time"????
    @Column(name="timemod")
    private Time timemod;

    //ce functie apelez pentru "data"????
    @Column(name="datamod")
    private Date datamod;

}