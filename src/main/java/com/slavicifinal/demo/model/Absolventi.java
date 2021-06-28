package com.slavicifinal.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "absolventi")
public class Absolventi implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    //    @OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
//    @JoinColumn(name = "iduniversitate")
    @Column
    private Universitati universitati;

//    @Column(name = "id_stud")
//    private Long idStud;


    @Column(name = "idpromotie")
    private Long idpromotie;

    //lungimea max 30 de caractere
    @Column(name = "nume", length = 30)
    private String nume;

    //lungimea max 30 de caractere
    @Column(name = "numenastere", length = 30)
    private String numenastere;

    //lungimea max 20 de caractere
    @Column(name = "initiale", length = 20)
    private String initiale;

    //lungimea de max 50 caractere
    @Column(name = "tata", length = 50)
    private String tata;

    //lungimea max 50 de caractere
    @Column(name = "mama", length = 50)
    private String mama;

    @Column(name = "datanastere")
    private Date datanastere;

    //lungimea max 35 de caractere
    @Column(name = "locnastere", length = 35)
    private String locnastere;

    //lungimea max 15 caractere
    @Column(name = "nr_mat", length = 15)
    private int nr_mat;

    //lungimea max 20 caractere
    @Column(name = "an_volum", length = 20)
    private int an_volum;

    //lungimea max 20 caractere
    @Column(name = "cnp", length = 20)
    private String cnp;

    //lungimea max 20 caractere
    @Column(name = "promotia", length = 20)
    private String promotia;

    //lungimea max 10 caractere
    @Column(name = "volumul", length = 10)
    private String volumul;

    //lungimea max 20 caractere
    @Column(name = "anul1", length = 20)
    private String anul1;

    //lungimea max 20 caractere
    @Column(name = "anul2", length = 20)
    private String anul2;

    //lungimea max 20 caractere
    @Column(name = "anul3", length = 20)
    private String anul3;

    //lungimea max 20 caractere
    @Column(name = "anul4", length = 20)
    private String anul4;

    //lungimea max 20 caractere
    @Column(name = "anul5", length = 20)
    private String anul5;

    @Column(name = "media")
    private float media;

    @Column(name = "sexul")
    private char sexul;

    @Column(name = "credite")
    private String credite;

    @Column(name = "totalpromotie")
    private int totalpromotie;

    @Column(name = "pozpromotie")
    private int pozpromotie;

    //lungimea max 30 caractere
    @Column(name = "prenume", length = 30)
    private String prenume;

    //lungimea max 20 caractere
    @Column(name = "anfinal", length = 20)
    private String anfinal;

//    @Column(name = "iduniversitate")
//    private Long iduniversitate;

    //tinyblob???
    @Column(name = "observatii")
    private String observatii;

    @Column(name = "licenta")
    private String licenta;

    //float(4.2)
    @Column(name = "m1")
    private float m1;

    //float(4.2)
    @Column(name = "m2")
    private float m2;

    //float(4.2)
    @Column(name = "m3")
    private float m3;

    //float(4.2)
    @Column(name = "m4")
    private float m4;

    //float(4.2)
    @Column(name = "c1")
    private float c1;

    //float(4.2)
    @Column(name = "c2")
    private float c2;

    //float(4.2)
    @Column(name = "c3")
    private float c3;

    //float(4.2)
    @Column(name = "c4")
    private float c4;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_stud")
    private Student student;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

//    public Long getIdStud() {
//        return idStud;
//    }
//
//    public void setIdStud(Long idStud) {
//        this.idStud = idStud;
//    }

    public Long getIdpromotie() {
        return idpromotie;
    }

    public void setIdpromotie(Long idpromotie) {
        this.idpromotie = idpromotie;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getNumenastere() {
        return numenastere;
    }

    public void setNumenastere(String numenastere) {
        this.numenastere = numenastere;
    }

    public String getInitiale() {
        return initiale;
    }

    public void setInitiale(String initiale) {
        this.initiale = initiale;
    }

    public String getTata() {
        return tata;
    }

    public void setTata(String tata) {
        this.tata = tata;
    }

    public String getMama() {
        return mama;
    }

    public void setMama(String mama) {
        this.mama = mama;
    }

    public Date getDatanastere() {
        return datanastere;
    }

    public void setDatanastere(Date datanastere) {
        this.datanastere = datanastere;
    }

    public String getLocnastere() {
        return locnastere;
    }

    public void setLocnastere(String locnastere) {
        this.locnastere = locnastere;
    }

    public int getNr_mat() {
        return nr_mat;
    }

    public void setNr_mat(int nr_mat) {
        this.nr_mat = nr_mat;
    }

    public int getAn_volum() {
        return an_volum;
    }

    public void setAn_volum(int an_volum) {
        this.an_volum = an_volum;
    }

    public String getCnp() {
        return cnp;
    }

    public void setCnp(String cnp) {
        this.cnp = cnp;
    }

    public String getPromotia() {
        return promotia;
    }

    public void setPromotia(String promotia) {
        this.promotia = promotia;
    }

    public String getVolumul() {
        return volumul;
    }

    public void setVolumul(String volumul) {
        this.volumul = volumul;
    }

    public String getAnul1() {
        return anul1;
    }

    public void setAnul1(String anul1) {
        this.anul1 = anul1;
    }

    public String getAnul2() {
        return anul2;
    }

    public void setAnul2(String anul2) {
        this.anul2 = anul2;
    }

    public String getAnul3() {
        return anul3;
    }

    public void setAnul3(String anul3) {
        this.anul3 = anul3;
    }

    public String getAnul4() {
        return anul4;
    }

    public void setAnul4(String anul4) {
        this.anul4 = anul4;
    }

    public String getAnul5() {
        return anul5;
    }

    public void setAnul5(String anul5) {
        this.anul5 = anul5;
    }

    public float getMedia() {
        return media;
    }

    public void setMedia(float media) {
        this.media = media;
    }

    public char getSexul() {
        return sexul;
    }

    public void setSexul(char sexul) {
        this.sexul = sexul;
    }

    public String getCredite() {
        return credite;
    }

    public void setCredite(String credite) {
        this.credite = credite;
    }

    public int getTotalpromotie() {
        return totalpromotie;
    }

    public void setTotalpromotie(int totalpromotie) {
        this.totalpromotie = totalpromotie;
    }

    public int getPozpromotie() {
        return pozpromotie;
    }

    public void setPozpromotie(int pozpromotie) {
        this.pozpromotie = pozpromotie;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public String getAnfinal() {
        return anfinal;
    }

    public void setAnfinal(String anfinal) {
        this.anfinal = anfinal;
    }

//    public Long getIduniversitate() {
//        return iduniversitate;
//    }
//
//    public void setIduniversitate(Long iduniversitate) {
//        this.iduniversitate = iduniversitate;
//    }

    public String getObservatii() {
        return observatii;
    }

    public void setObservatii(String observatii) {
        this.observatii = observatii;
    }

    public String getLicenta() {
        return licenta;
    }

    public void setLicenta(String licenta) {
        this.licenta = licenta;
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

    public Universitati getUniversitati() {
        return universitati;
    }

    public void setUniversitati(Universitati universitati) {
        this.universitati = universitati;
    }
}