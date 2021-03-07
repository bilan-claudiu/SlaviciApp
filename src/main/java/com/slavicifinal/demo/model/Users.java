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
@Table(name = "users")
public class Users implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //varchar 25
    @Column(name="user", length = 25)
    private Integer user;

    //varchar 25
    @Column(name="passwd", length = 25)
    private String passwd;

    //varchar 25
    @Column(name="nume", length = 25)
    private String nume;

    //varchar 25
    @Column(name="prenume", length = 25)
    private String prenume;

    //varchar(10)
    @Column(name="seriebi", length = 10)
    private String seriebi;

    //varchar(20)
    @Column(name="nrbi", length = 20)
    private String nrbi;

    //blob = binary large object
    @Column(name="domiciliu")
    private String domiciliu;

    //varchar(30)
    @Column(name="tel", length = 30)
    private String tel;

    //varchar(30)
    @Column(name="cnp", length = 30)
    private String cnp;

    //varchar(30)
    @Column(name="poza", length = 30)
    private String poza;

    //mediumblob
    @Column(name="observatii")
    private String observatii;

    //int
    @Column(name="viz_date")
    private Boolean viz_date;

    //tinyint(1)
    @Column(name="intro_stud")
    private Boolean intro_stud;

    //tinyint(1)
    @Column(name="intro_note")
    private Boolean intro_note;

    //tinyint(1)
    @Column(name="echivalari")
    private Boolean echivalari;

    //tinyint(1)
    @Column(name="transfer")
    private Boolean transfer;

    //tinyint(1)
    @Column(name="citiredate")
    private Boolean citiredate;

    //tinyint(1)
    @Column(name="intro_date_ani")
    private Boolean intro_date_ani;

    //int
    @Column(name="status")
    private Integer status;

    //date
    @Column(name="intro_date")
    private Date intro_date;

    //date
    @Column(name="start_date")
    private Date start_date;

    //date
    @Column(name="stop_date")
    private Date stop_date;

    //date
    @Column(name="datamod")
    private Date datamod;

    //time
    @Column(name="timemod")
    private Time timemod;

    public Integer getUser() {
        return user;
    }

    public void setUser(Integer user) {
        this.user = user;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public String getSeriebi() {
        return seriebi;
    }

    public void setSeriebi(String seriebi) {
        this.seriebi = seriebi;
    }

    public String getNrbi() {
        return nrbi;
    }

    public void setNrbi(String nrbi) {
        this.nrbi = nrbi;
    }

    public String getDomiciliu() {
        return domiciliu;
    }

    public void setDomiciliu(String domiciliu) {
        this.domiciliu = domiciliu;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getCnp() {
        return cnp;
    }

    public void setCnp(String cnp) {
        this.cnp = cnp;
    }

    public String getPoza() {
        return poza;
    }

    public void setPoza(String poza) {
        this.poza = poza;
    }

    public String getObservatii() {
        return observatii;
    }

    public void setObservatii(String observatii) {
        this.observatii = observatii;
    }

    public Boolean getViz_date() {
        return viz_date;
    }

    public void setViz_date(Boolean viz_date) {
        this.viz_date = viz_date;
    }

    public Boolean getIntro_stud() {
        return intro_stud;
    }

    public void setIntro_stud(Boolean intro_stud) {
        this.intro_stud = intro_stud;
    }

    public Boolean getIntro_note() {
        return intro_note;
    }

    public void setIntro_note(Boolean intro_note) {
        this.intro_note = intro_note;
    }

    public Boolean getEchivalari() {
        return echivalari;
    }

    public void setEchivalari(Boolean echivalari) {
        this.echivalari = echivalari;
    }

    public Boolean getTransfer() {
        return transfer;
    }

    public void setTransfer(Boolean transfer) {
        this.transfer = transfer;
    }

    public Boolean getCitiredate() {
        return citiredate;
    }

    public void setCitiredate(Boolean citiredate) {
        this.citiredate = citiredate;
    }

    public Boolean getIntro_date_ani() {
        return intro_date_ani;
    }

    public void setIntro_date_ani(Boolean intro_date_ani) {
        this.intro_date_ani = intro_date_ani;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getIntro_date() {
        return intro_date;
    }

    public void setIntro_date(Date intro_date) {
        this.intro_date = intro_date;
    }

    public Date getStart_date() {
        return start_date;
    }

    public void setStart_date(Date start_date) {
        this.start_date = start_date;
    }

    public Date getStop_date() {
        return stop_date;
    }

    public void setStop_date(Date stop_date) {
        this.stop_date = stop_date;
    }
}