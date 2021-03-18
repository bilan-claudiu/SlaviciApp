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
    private float medie;

    //varchar(100)
    @Column(name="nume", length = 100)
    private String nume;

    //bigint
    @Column(name="id_stud")
    private Long idStud;

    //int
    @Column(name="credite")
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

    //varchar(10)
    @Column(name="initiale", length = 10)
    private String initiale;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public float getMedie() {
        return medie;
    }

    public void setMedie(float medie) {
        this.medie = medie;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public Long getIdStud() {
        return idStud;
    }

    public void setIdStud(Long idStud) {
        this.idStud = idStud;
    }

    public int getCredite() {
        return credite;
    }

    public void setCredite(int credite) {
        this.credite = credite;
    }

    public float getM1() {
        return m1;
    }

    public void setM1(float m1) {
        this.m1 = m1;
    }

    public float getM2() {
        return m2;
    }

    public void setM2(float m2) {
        this.m2 = m2;
    }

    public float getM3() {
        return m3;
    }

    public void setM3(float m3) {
        this.m3 = m3;
    }

    public float getM4() {
        return m4;
    }

    public void setM4(float m4) {
        this.m4 = m4;
    }

    public float getC1() {
        return c1;
    }

    public void setC1(float c1) {
        this.c1 = c1;
    }

    public float getC2() {
        return c2;
    }

    public void setC2(float c2) {
        this.c2 = c2;
    }

    public float getC3() {
        return c3;
    }

    public void setC3(float c3) {
        this.c3 = c3;
    }

    public float getC4() {
        return c4;
    }

    public void setC4(float c4) {
        this.c4 = c4;
    }

    public String getInitiale() {
        return initiale;
    }

    public void setInitiale(String initiale) {
        this.initiale = initiale;
    }
}