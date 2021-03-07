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
    private Time timemod;

    //ce functie apelez pentru "data"????
    @Column(name="datamod")
<<<<<<< HEAD
    private Date datamod;
=======
    private String datamod;

    public Long getId() {
        return id;
    }
<<<<<<< HEAD
>>>>>>> 00ba1cb7ae9e2656391b506277d742fec6e53dad
=======

    public void setId(Long id) {
        this.id = id;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getDecan() {
        return decan;
    }

    public void setDecan(String decan) {
        this.decan = decan;
    }

    public String getProdecan1() {
        return prodecan1;
    }

    public void setProdecan1(String prodecan1) {
        this.prodecan1 = prodecan1;
    }

    public String getSecretar() {
        return secretar;
    }

    public void setSecretar(String secretar) {
        this.secretar = secretar;
    }

    public Long getIduser() {
        return iduser;
    }

    public void setIduser(Long iduser) {
        this.iduser = iduser;
    }
>>>>>>> 3fc1a16bc4db8e6e1b6dcfd0f3770119c61adc39
}