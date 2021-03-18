package com.slavicifinal.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.tomcat.jni.Address;

import javax.persistence.*;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "universitati")

public class Universitati implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //varchar(50)
    @Column(name="nume", length = 50)
    private String nume;

    //varchar(30)
    @Column(name="pag1", length = 30)
    private String pag1;

    //varchar(30)
    @Column(name="pag2", length = 30)
    private String pag2;

    //varchar(30)
    @Column(name="pag3", length = 30)
    private String pag3;

    //varchar(30)
    @Column(name="pag4", length = 30)
    private String pag4;

    //varchar(50)
    @Column(name="adeverinta", length = 50)
    private String adeverinta;

    //varchar(50)
    @Column(name="certificat", length = 50)
    private int certificat;

    //varchar(50)
    @Column(name="coperta", length = 50)
    private String coperta;

    //varchar(50)
    @Column(name="pag5", length = 50)
    private String pag5;

    //varchar(50)
    @Column(name="pag6", length = 50)
    private String pag6;

    //varchar(50)
    @Column(name="pag7", length = 50)
    private String pag7;

    //varchar(30)
    @Column(name="sitp1", length = 30)
    private String sitp1;


    //varchar(30)
    @Column(name="sitp2", length = 30)
    private String sitp2;

    //varchar(30)
    @Column(name="sitp3", length = 30)
    private String sitp3;

    //varchar(30)
    @Column(name="sitp4", length = 30)
    private String sitp4;

    //varchar(30)
    @Column(name="sitp5", length = 30)
    private String sitp5;


    //varchar(30)
    @Column(name="sitp6", length = 30)
    private String sitp6;

    //varchar(30)
    @Column(name="sitp7", length = 30)
    private String sitp7;

    //int
    @Column(name="specializarea")
    private int specializarea;

    //varchar(50)
    @Column(name="numespec", length = 50)
    private String numespec;

    //varchar(50)
    @Column(name="numespecen", length = 50)
    private int numespecen;


    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "iduniversitate")
    private Absolventi absolventi;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPag1() {
        return pag1;
    }

    public void setPag1(String pag1) {
        this.pag1 = pag1;
    }

    public String getPag2() {
        return pag2;
    }

    public void setPag2(String pag2) {
        this.pag2 = pag2;
    }

    public String getPag3() {
        return pag3;
    }

    public void setPag3(String pag3) {
        this.pag3 = pag3;
    }

    public String getPag4() {
        return pag4;
    }

    public void setPag4(String pag4) {
        this.pag4 = pag4;
    }

    public String getAdeverinta() {
        return adeverinta;
    }

    public void setAdeverinta(String adeverinta) {
        this.adeverinta = adeverinta;
    }

    public int getCertificat() {
        return certificat;
    }

    public void setCertificat(int certificat) {
        this.certificat = certificat;
    }

    public String getCoperta() {
        return coperta;
    }

    public void setCoperta(String coperta) {
        this.coperta = coperta;
    }

    public String getPag5() {
        return pag5;
    }

    public void setPag5(String pag5) {
        this.pag5 = pag5;
    }

    public String getPag6() {
        return pag6;
    }

    public void setPag6(String pag6) {
        this.pag6 = pag6;
    }

    public String getPag7() {
        return pag7;
    }

    public void setPag7(String pag7) {
        this.pag7 = pag7;
    }

    public String getSitp1() {
        return sitp1;
    }

    public void setSitp1(String sitp1) {
        this.sitp1 = sitp1;
    }

    public String getSitp2() {
        return sitp2;
    }

    public void setSitp2(String sitp2) {
        this.sitp2 = sitp2;
    }

    public String getSitp3() {
        return sitp3;
    }

    public void setSitp3(String sitp3) {
        this.sitp3 = sitp3;
    }

    public String getSitp4() {
        return sitp4;
    }

    public void setSitp4(String sitp4) {
        this.sitp4 = sitp4;
    }

    public String getSitp5() {
        return sitp5;
    }

    public void setSitp5(String sitp5) {
        this.sitp5 = sitp5;
    }

    public String getSitp6() {
        return sitp6;
    }

    public void setSitp6(String sitp6) {
        this.sitp6 = sitp6;
    }

    public String getSitp7() {
        return sitp7;
    }

    public void setSitp7(String sitp7) {
        this.sitp7 = sitp7;
    }

    public int getSpecializarea() {
        return specializarea;
    }

    public void setSpecializarea(int specializarea) {
        this.specializarea = specializarea;
    }

    public String getNumespec() {
        return numespec;
    }

    public void setNumespec(String numespec) {
        this.numespec = numespec;
    }

    public int getNumespecen() {
        return numespecen;
    }

    public void setNumespecen(int numespecen) {
        this.numespecen = numespecen;
    }

    public Absolventi getAbsolventi() {
        return absolventi;
    }

    public void setAbsolventi(Absolventi absolventi) {
        this.absolventi = absolventi;
    }
}