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
@Table(name = "facultati")
public class Facultati implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //lung. max 50 caract.
    @Column(name="nume")
    private String nume;

    //lung. max 50 caract.
    @Column(name="decan")
    private String decan;

    //lung. max 50 caract.
    @Column(name="prodecan1")
    private String prodecan1;

    //lung. max 50 caract.
    @Column(name="secretar")
    private String secretar;

    @Column(name="iduser")
    private Long iduser;

    //ce functie apelez pentru "time"????
    @Column(name="timemod")
    private String timemod;

    //ce functie apelez pentru "data"????
    @Column(name="datamod")
    private String datamod;
}