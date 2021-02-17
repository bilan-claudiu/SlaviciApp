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
    @Column(name="nume", length = 50)
    private String nume;

    //lung. max 50 caract.
    @Column(name="decan", length = 50)
    private String decan;

    //lung. max 50 caract.
    @Column(name="prodecan1", length = 50)
    private String prodecan1;

    //lung. max 50 caract.
    @Column(name="secretar", length = 50)
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