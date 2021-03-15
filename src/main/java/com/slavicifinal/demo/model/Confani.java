package com.slavicifinal.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "confani")
public class Confani implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //(GenerationType.IDENTITY???)
    @Column(name="idmaterie")
    private Long idmaterie;

    //lung. max 20 caract.(GenerationType.IDENTITY???)
    @Column(name="promotie", length = 20)
    private String promotie;

    //lung. max 3 caract.
    @Column(name="specializare", length = 3)
    private String specializare;

    @Column(name="anstudiu")
    private int anstudiu;

    @Column(name="semestru")
    private int semestru;

    @Column(name="tipdisciplina")
    private int tipdisciplina;

    @Column(name="formaex")
    private int formaex;

    @Column(name="credite")
    private int credite;

    //ce functie apelez pentru "blob"????
    @Column(name="observatii")
    private String observatii;

    @Column(name="iduser")
    private Long iduser;

    //ce functie apelez pentru "time"????
    @Column(name="timemod")
    private String timemod;

    //ce functie apelez pentru "data"????
    @Column(name="datamod")
    private LocalDate datamod;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdmaterie() {
        return idmaterie;
    }

    public void setIdmaterie(Long idmaterie) {
        this.idmaterie = idmaterie;
    }

    public String getPromotie() {
        return promotie;
    }

    public void setPromotie(String promotie) {
        this.promotie = promotie;
    }

    public String getSpecializare() {
        return specializare;
    }

    public void setSpecializare(String specializare) {
        this.specializare = specializare;
    }

    public int getAnstudiu() {
        return anstudiu;
    }

    public void setAnstudiu(int anstudiu) {
        this.anstudiu = anstudiu;
    }

    public int getSemestru() {
        return semestru;
    }

    public void setSemestru(int semestru) {
        this.semestru = semestru;
    }

    public int getTipdisciplina() {
        return tipdisciplina;
    }

    public void setTipdisciplina(int tipdisciplina) {
        this.tipdisciplina = tipdisciplina;
    }

    public int getFormaex() {
        return formaex;
    }

    public void setFormaex(int formaex) {
        this.formaex = formaex;
    }

    public int getCredite() {
        return credite;
    }

    public void setCredite(int credite) {
        this.credite = credite;
    }

    public String getObservatii() {
        return observatii;
    }

    public void setObservatii(String observatii) {
        this.observatii = observatii;
    }

    public Long getIduser() {
        return iduser;
    }

    public void setIduser(Long iduser) {
        this.iduser = iduser;
    }

    public String getTimemod() {
        return timemod;
    }

    public void setTimemod(String timemod) {
        this.timemod = timemod;
    }

    public LocalDate getDatamod() {
        return datamod;
    }

    public void setDatamod(LocalDate datamod) {
        this.datamod = datamod;
    }
}