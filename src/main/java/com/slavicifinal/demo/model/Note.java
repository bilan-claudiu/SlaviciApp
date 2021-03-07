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
<<<<<<< HEAD
=======
=======
>>>>>>> 3fc1a16bc4db8e6e1b6dcfd0f3770119c61adc39

    public Long getId() {
        return id;
    }

<<<<<<< HEAD
>>>>>>> 00ba1cb7ae9e2656391b506277d742fec6e53dad
=======
    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdstud() {
        return idstud;
    }

    public void setIdstud(Long idstud) {
        this.idstud = idstud;
    }

    public Long getIdconfani() {
        return idconfani;
    }

    public void setIdconfani(Long idconfani) {
        this.idconfani = idconfani;
    }

    public float getNotaf() {
        return notaf;
    }

    public void setNotaf(float notaf) {
        this.notaf = notaf;
    }

    public float getNotaa() {
        return notaa;
    }

    public void setNotaa(float notaa) {
        this.notaa = notaa;
    }

    public float getNotac() {
        return notac;
    }

    public void setNotac(float notac) {
        this.notac = notac;
    }

    public int getIduser() {
        return iduser;
    }

    public void setIduser(int iduser) {
        this.iduser = iduser;
    }
>>>>>>> 3fc1a16bc4db8e6e1b6dcfd0f3770119c61adc39
}