package com.slavicifinal.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;
import java.sql.Time;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "users")
public class Users implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //varchar 25
    @Column(name = "user", length = 25)
    private int user;

    //varchar 25
    @Column(name = "passwd", length = 25)
    private String passwd;

    //varchar 25
    @Column(name = "nume", length = 25)
    private String nume;

    //varchar 25
    @Column(name = "prenume", length = 25)
    private String prenume;

    //varchar(10)
    @Column(name = "seriebi", length = 10)
    private String seriebi;

    //varchar(20)
    @Column(name = "nrbi", length = 20)
    private String nrbi;

    //blob = binary large object
    @Column(name = "domiciliu")
    private String domiciliu;

    //varchar(30)
    @Column(name = "tel", length = 30)
    private String tel;

    //varchar(30)
    @Column(name = "cnp", length = 30)
    private String cnp;

    //varchar(30)
    @Column(name = "poza", length = 30)
    private String poza;

    //mediumblob
    @Column(name = "observatii")
    private String observatii;

    //int
    @Column(name = "viz_date")
    private Boolean vizDate;

    //tinyint(1)
    @Column(name = "intro_stud")
    private Boolean introStud;

    //tinyint(1)
    @Column(name = "intro_note")
    private Boolean introNote;

    //tinyint(1)
    @Column(name = "echivalari")
    private Boolean echivalari;

    //tinyint(1)
    @Column(name = "transfer")
    private Boolean transfer;

    //tinyint(1)
    @Column(name = "citiredate")
    private Boolean citiredate;

    //tinyint(1)
    @Column(name = "intro_date_ani")
    private Boolean introDateAni;

    //int
    @Column(name = "status")
    private Integer status;

    //date
    @Column(name = "intro_date")
    private Date introDate;

    //date
    @Column(name = "start_date")
    private Date startDate;

    //date
    @Column(name = "stop_date")
    private Date stopDate;

    //date
    @Column(name = "datamod")
    private LocalDate datamod;

    //time
    @Column(name = "timemod")
    private String timemod;

    public int getUser() {
        return user;
    }

    public void setUser(int user) {
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

    public Boolean getVizDate() {
        return vizDate;
    }

    public void setVizDate(Boolean vizDate) {
        this.vizDate = vizDate;
    }

    public Boolean getIntroStud() {
        return introStud;
    }

    public void setIntroStud(Boolean introStud) {
        this.introStud = introStud;
    }

    public Boolean getIntroNote() {
        return introNote;
    }

    public void setIntroNote(Boolean introNote) {
        this.introNote = introNote;
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

    public Boolean getIntroDateAni() {
        return introDateAni;
    }

    public void setIntroDateAni(Boolean introDateAni) {
        this.introDateAni = introDateAni;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getIntroDate() {
        return introDate;
    }

    public void setIntroDate(Date introDate) {
        this.introDate = introDate;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getStopDate() {
        return stopDate;
    }

    public void setStopDate(Date stopDate) {
        this.stopDate = stopDate;
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

    public void setId(Long id) {
        this.id = id;
    }
}