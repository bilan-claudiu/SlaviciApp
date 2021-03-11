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
@Table(name = "materie")
public class Materie implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //lung. max 15 caract.
    @Column(name="cod_mat", length = 15)
    private String codMat;

    //lung. max 50 caract.
    @Column(name="denum_mat", length = 50)
    private String denumMat;

    //lung. max 5 caract.
    @Column(name="orecurs", length = 5)
    private String orecurs;

    //lung. max 5 caract.
    @Column(name="oresem", length = 5)
    private String oresem;

    //lung. max 5 caract.
    @Column(name="orelab", length = 5)
    private String orelab;

    //lung. max 5 caract.
    @Column(name="orepgr", length = 5)
    private String orepgr;

    //lung. max 5 caract.
    @Column(name="orepractica", length = 5)
    private String orepractica;

    @Column(name="iduser")
    private Long iduser;

    //ce functie apelez pentru "time"????
    @Column(name="timemod")
    private String timemod;

    //ce functie apelez pentru "data"????
    @Column(name="datamod")
    private LocalDate datamod;

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodMat() {
        return codMat;
    }

    public void setCodMat(String codMat) {
        this.codMat = codMat;
    }

    public String getDenumMat() {
        return denumMat;
    }

    public void setDenumMat(String denumMat) {
        this.denumMat = denumMat;
    }

    public String getOrecurs() {
        return orecurs;
    }

    public void setOrecurs(String orecurs) {
        this.orecurs = orecurs;
    }

    public String getOresem() {
        return oresem;
    }

    public void setOresem(String oresem) {
        this.oresem = oresem;
    }

    public String getOrelab() {
        return orelab;
    }

    public void setOrelab(String orelab) {
        this.orelab = orelab;
    }

    public String getOrepgr() {
        return orepgr;
    }

    public void setOrepgr(String orepgr) {
        this.orepgr = orepgr;
    }

    public String getOrepractica() {
        return orepractica;
    }

    public void setOrepractica(String orepractica) {
        this.orepractica = orepractica;
    }

    public Long getIduser() {
        return iduser;
    }

    public void setIduser(Long iduser) {
        this.iduser = iduser;
    }

    public LocalDate getDatamod() {
        return datamod;
    }

    public void setDatamod(LocalDate datamod) {
        this.datamod = datamod;
    }

    public String getTimemod() {
        return timemod;
    }

    public void setTimemod(String timemod) {
        this.timemod = timemod;
    }

    public Long getId() {
        return id;




    }
}