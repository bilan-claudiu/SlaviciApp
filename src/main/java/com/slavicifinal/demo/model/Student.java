package com.slavicifinal.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;
import java.time.LocalDate;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "student")
public class Student implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // varchar(30)
    @Column(name="nnastere",  length = 30)
    private String nnastere;

    // varchar(30)
    @Column(name="nactual",  length = 30)
    private String nactual;

    // varchar(30)
    @Column(name="prenume",  length = 30)
    private String prenume;

    // varchar(30)
    @Column(name="pmama",  length = 30)
    private String pmama;

    // varchar(30)
    @Column(name="ptata",  length = 30)
    private String ptata;

    // varchar(20)
    @Column(name="cnp",  length = 20)
    private String cnp;

    // date
    @Column(name="dnastere",  length = 30)
    private Date dnastere;

    // varchar(25)
    @Column(name="tnastere",  length = 25)
    private String tnastere;

    // varchar(25)
    @Column(name="lnastere",  length = 25)
    private String lnastere;

    // varchar(40)
    @Column(name="jnastere",  length = 40)
    private String jnastere;

    // int
    @Column(name="sexul")
    private Integer sexul;

    // varchar(15)
    @Column(name="civila",  length = 15)
    private String civila;

    // varchar(50)
    @Column(name="social",  length = 50)
    private String social;

    // varchar(40)
    @Column(name="cetatenie",  length = 40)
    private String cetatenie;

    // varchar(40)
    @Column(name="nationalitate",  length = 40)
    private String nationalitate;

    // tinyint(1)
    @Column(name="stagiumilitar")
    private boolean stagiumilitar;

    // varchar(40)
    @Column(name="etnie",  length = 40)
    private String etnie;

    // varchar(40)
    @Column(name="domiciliul",  length = 40)
    private String domiciliul;

    // varchar(25)
    @Column(name="domiciliuj",  length = 25)
    private String domiciliuj;

    // varchar(25)
    @Column(name="domiciliut",  length = 25)
    private String domiciliut;

    // varchar(35)
    @Column(name="domiciliua",  length = 35)
    private String domiciliua;

    // varchar(10)
    @Column(name="domiciliuc",  length = 10)
    private String domiciliuc;

    // varchar(10)
    @Column(name="serieid",  length = 10)
    private String serieid;

    // varchar(15)
    @Column(name="nrid",  length = 15)
    private String nrid;

    //tipid varchar(20)
    @Column(name="tipid", length = 20)
    private String tipid;

    // varchar(50)
    @Column(name="eliberatid", length = 50)
    private String eliberatid;

    // date
    @Column(name="dataelid")
    private Date dataelid;

    // date
    @Column(name="dataexpid")
    private Date dataexpid;

    // varchar(30)
    @Column(name="telefon", length = 30)
    private String telefon;

    // varchar(50)
    @Column(name="informare",  length = 50)
    private String informare;

    //work varchar(50)
    @Column(name="work",  length = 50)
    private String work ;

    // varchar(35)
    @Column(name="email",  length = 35)
    private String email;

    // varchar(50)
    @Column(name="dezabilitati",  length = 50)
    private String dezabilitati;

    // varchar(25)
    @Column(name="liceu_localit",  length = 25)
    private String liceu_localit;

    // varchar(25)
    @Column(name="liceu_tara",  length = 25)
    private String liceu_tara;

    // varchar(25)
    @Column(name="liceu_judet",  length = 25)
    private String liceu_judet;

    // varchar(50)
    @Column(name="liceu_profil",  length = 50)
    private String liceu_profil;

    // varchar(20)
    @Column(name="liceu_durata",  length = 20)
    private String liceu_durata;

    // varchar(20)
    @Column(name="liceu_anabs",  length = 20)
    private String liceu_anabs;

    // varchar(25)
    @Column(name="liceu_forma",  length = 25)
    private String liceu_forma;

    // varchar(50)
    @Column(name="liceu_diploma",  length = 50)
    private String liceu_diploma;

    // varchar(25)
    @Column(name="liceu_serie",  length = 25)
    private String liceu_serie;

    // varchar(25)
    @Column(name="liceu_numar",  length = 25)
    private String liceu_numar;

    // varchar(40)
    @Column(name="liceu_emis",  length = 40)
    private String liceu_emis;

    // varchar(5)
    @Column(name="liceu_anemis",  length = 5)
    private String liceu_anemis;

    // varchar(15)
    @Column(name="liceu_matricola",  length = 15)
    private String liceu_matricola;

    // varchar(30)
    @Column(name="liceu_vizare",  length = 30)
    private String liceu_vizare;

    // float(5,2)
    @Column(name="liceu_bac")
    private Float liceu_bac;

    // float(5,2)
    @Column(name="liceu_media")
    private Float liceu_media;

    // varchar(25)
    @Column(name="univ_tara",  length = 25)
    private String univ_tara;

    // varchar(25)
    @Column(name="univ_localit",  length = 25)
    private String univ_localit;

    // varchar(25)
    @Column(name="univ_judet",  length = 25)
    private String univ_judet;

    // varchar(50)
    @Column(name="univ_denumire",  length = 50)
    private String univ_denumire;

    // varchar(50)
    @Column(name="liceu_denumire",  length = 50)
    private String liceu_denumire;

    // varchar(50)
    @Column(name="univ_facultate",  length = 50)
    private String univ_facultate;

    // varchar(50)
    @Column(name="univ_domeniu",  length = 50)
    private String univ_domeniu;

    // varchar(50)
    @Column(name="univ_specializare",  length = 50)
    private String univ_specializare;

    // varchar(50)
    @Column(name="univ_titlu",  length = 50)
    private String univ_titlu;

    // varchar(15)
    @Column(name="univ_forma",  length = 15)
    private String univ_forma;

    // varchar(15)
    @Column(name="univ_taxa",  length = 15)
    private String univ_taxa;

    // varchar(15)
    @Column(name="univ_durata",  length = 15)
    private String univ_durata;

    // varchar(5)
    @Column(name="univ_anabs",  length = 5)
    private String univ_anabs;

    // varchar(25)
    @Column(name="univ_diploma",  length = 25)
    private String univ_diploma;

    // varchar(25
    @Column(name="univ_serie",  length = 25)
    private String univ_serie;

    // varchar(25)
    @Column(name="univ_numar",  length = 25)
    private String univ_numar;

    // varchar(25)
    @Column(name="univ_emis",  length = 25)
    private String univ_emis;

    // varchar(5)
    @Column(name="univ_anemis",  length = 5)
    private String univ_anemis;

    // varchar(15)
    @Column(name="univ_matricola",  length = 15)
    private String univ_matricola;

    // varchar(30)
    @Column(name="univ_vizare",  length = 30)
    private String univ_vizare;

    // varchar(3)
    @Column(name="idspecializare",  length = 3)
    private String idspecializare;

    // int
    @Column(name="forma")
    private Integer forma;

    // varchar(25)
    @Column(name="anpregatitor", length = 25)
    private String anpregatitor;

    // varchar(50)
    @Column(name="volumul",  length = 50)
    private String volumul;

    // varchar(50)
    @Column(name="nr_mat",  length = 50)
    private String nr_mat;

    // tinyint(1)
    @Column(name="exportweb")
    private Boolean exportweb;

    // varchar(20)
    @Column(name="promotia",  length = 20)
    private String promotia;

    // varchar(4)
    @Column(name="anfinal",  length = 4)
    private String anfinal;

    // varchar(4)
    @Column(name="anlic",  length = 4)
    private String anlic;

    // varchar(25)
    @Column(name="poza",  length = 25)
    private String poza;

    // mediumblob
    @Column(name="observatii")
    private String observatii;

    // bigint
    @Column(name="iduser")
    private Long iduser;

    // date
    @Column(name="datamod",  length = 30)
    private LocalDate datamod;

    // time
    @Column(name="timemod",  length = 30)
    private String timemod;

    // int
    @Column(name="tipstudent")
    private Integer tipstudent;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNnastere() {
        return nnastere;
    }

    public void setNnastere(String nnastere) {
        this.nnastere = nnastere;
    }

    public String getNactual() {
        return nactual;
    }

    public void setNactual(String nactual) {
        this.nactual = nactual;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public String getPmama() {
        return pmama;
    }

    public void setPmama(String pmama) {
        this.pmama = pmama;
    }

    public String getPtata() {
        return ptata;
    }

    public void setPtata(String ptata) {
        this.ptata = ptata;
    }

    public String getCnp() {
        return cnp;
    }

    public void setCnp(String cnp) {
        this.cnp = cnp;
    }

    public Date getDnastere() {
        return dnastere;
    }

    public void setDnastere(Date dnastere) {
        this.dnastere = dnastere;
    }

    public String getTnastere() {
        return tnastere;
    }

    public void setTnastere(String tnastere) {
        this.tnastere = tnastere;
    }

    public String getLnastere() {
        return lnastere;
    }

    public void setLnastere(String lnastere) {
        this.lnastere = lnastere;
    }

    public String getJnastere() {
        return jnastere;
    }

    public void setJnastere(String jnastere) {
        this.jnastere = jnastere;
    }

    public Integer getSexul() {
        return sexul;
    }

    public void setSexul(Integer sexul) {
        this.sexul = sexul;
    }

    public String getCivila() {
        return civila;
    }

    public void setCivila(String civila) {
        this.civila = civila;
    }

    public String getSocial() {
        return social;
    }

    public void setSocial(String social) {
        this.social = social;
    }

    public String getCetatenie() {
        return cetatenie;
    }

    public void setCetatenie(String cetatenie) {
        this.cetatenie = cetatenie;
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

    public String getNationalitate() {
        return nationalitate;
    }

    public void setNationalitate(String nationalitate) {
        this.nationalitate = nationalitate;
    }

    public boolean getStagiumilitar() {
        return stagiumilitar;
    }

    public void setStagiumilitar(boolean stagiumilitar) {
        this.stagiumilitar = stagiumilitar;
    }

    public String getEtnie() {
        return etnie;
    }

    public void setEtnie(String etnie) {
        this.etnie = etnie;
    }

    public String getDomiciliul() {
        return domiciliul;
    }

    public void setDomiciliul(String domiciliul) {
        this.domiciliul = domiciliul;
    }

    public String getDomiciliuj() {
        return domiciliuj;
    }

    public void setDomiciliuj(String domiciliuj) {
        this.domiciliuj = domiciliuj;
    }

    public String getDomiciliut() {
        return domiciliut;
    }

    public void setDomiciliut(String domiciliut) {
        this.domiciliut = domiciliut;
    }

    public String getDomiciliua() {
        return domiciliua;
    }

    public void setDomiciliua(String domiciliua) {
        this.domiciliua = domiciliua;
    }

    public String getDomiciliuc() {
        return domiciliuc;
    }

    public void setDomiciliuc(String domiciliuc) {
        this.domiciliuc = domiciliuc;
    }

    public String getSerieid() {
        return serieid;
    }

    public void setSerieid(String serieid) {
        this.serieid = serieid;
    }

    public String getNrid() {
        return nrid;
    }

    public void setNrid(String nrid) {
        this.nrid = nrid;
    }

    public String getTipid() {
        return tipid;
    }

    public void setTipid(String tipid) {
        this.tipid = tipid;
    }

    public String getEliberatid() {
        return eliberatid;
    }

    public void setEliberatid(String eliberatid) {
        this.eliberatid = eliberatid;
    }

    public Date getDataelid() {
        return dataelid;
    }

    public void setDataelid(Date dataelid) {
        this.dataelid = dataelid;
    }

    public Date getDataexpid() {
        return dataexpid;
    }

    public void setDataexpid(Date dataexpid) {
        this.dataexpid = dataexpid;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getInformare() {
        return informare;
    }

    public void setInformare(String informare) {
        this.informare = informare;
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDezabilitati() {
        return dezabilitati;
    }

    public void setDezabilitati(String dezabilitati) {
        this.dezabilitati = dezabilitati;
    }

    public String getLiceu_localit() {
        return liceu_localit;
    }

    public void setLiceu_localit(String liceu_localit) {
        this.liceu_localit = liceu_localit;
    }

    public String getLiceu_tara() {
        return liceu_tara;
    }

    public void setLiceu_tara(String liceu_tara) {
        this.liceu_tara = liceu_tara;
    }

    public String getLiceu_judet() {
        return liceu_judet;
    }

    public void setLiceu_judet(String liceu_judet) {
        this.liceu_judet = liceu_judet;
    }

    public String getLiceu_profil() {
        return liceu_profil;
    }

    public void setLiceu_profil(String liceu_profil) {
        this.liceu_profil = liceu_profil;
    }

    public String getLiceu_durata() {
        return liceu_durata;
    }

    public void setLiceu_durata(String liceu_durata) {
        this.liceu_durata = liceu_durata;
    }

    public String getLiceu_anabs() {
        return liceu_anabs;
    }

    public void setLiceu_anabs(String liceu_anabs) {
        this.liceu_anabs = liceu_anabs;
    }

    public String getLiceu_forma() {
        return liceu_forma;
    }

    public void setLiceu_forma(String liceu_forma) {
        this.liceu_forma = liceu_forma;
    }

    public String getLiceu_diploma() {
        return liceu_diploma;
    }

    public void setLiceu_diploma(String liceu_diploma) {
        this.liceu_diploma = liceu_diploma;
    }

    public String getLiceu_serie() {
        return liceu_serie;
    }

    public void setLiceu_serie(String liceu_serie) {
        this.liceu_serie = liceu_serie;
    }

    public String getLiceu_numar() {
        return liceu_numar;
    }

    public void setLiceu_numar(String liceu_numar) {
        this.liceu_numar = liceu_numar;
    }

    public String getLiceu_emis() {
        return liceu_emis;
    }

    public void setLiceu_emis(String liceu_emis) {
        this.liceu_emis = liceu_emis;
    }

    public String getLiceu_anemis() {
        return liceu_anemis;
    }

    public void setLiceu_anemis(String liceu_anemis) {
        this.liceu_anemis = liceu_anemis;
    }

    public String getLiceu_matricola() {
        return liceu_matricola;
    }

    public void setLiceu_matricola(String liceu_matricola) {
        this.liceu_matricola = liceu_matricola;
    }

    public String getLiceu_vizare() {
        return liceu_vizare;
    }

    public void setLiceu_vizare(String liceu_vizare) {
        this.liceu_vizare = liceu_vizare;
    }

    public Float getLiceu_bac() {
        return liceu_bac;
    }

    public void setLiceu_bac(Float liceu_bac) {
        this.liceu_bac = liceu_bac;
    }

    public Float getLiceu_media() {
        return liceu_media;
    }

    public void setLiceu_media(Float liceu_media) {
        this.liceu_media = liceu_media;
    }

    public String getUniv_tara() {
        return univ_tara;
    }

    public void setUniv_tara(String univ_tara) {
        this.univ_tara = univ_tara;
    }

    public String getUniv_localit() {
        return univ_localit;
    }

    public void setUniv_localit(String univ_localit) {
        this.univ_localit = univ_localit;
    }

    public String getUniv_judet() {
        return univ_judet;
    }

    public void setUniv_judet(String univ_judet) {
        this.univ_judet = univ_judet;
    }

    public String getUniv_denumire() {
        return univ_denumire;
    }

    public void setUniv_denumire(String univ_denumire) {
        this.univ_denumire = univ_denumire;
    }

    public String getLiceu_denumire() {
        return liceu_denumire;
    }

    public void setLiceu_denumire(String liceu_denumire) {
        this.liceu_denumire = liceu_denumire;
    }

    public String getUniv_facultate() {
        return univ_facultate;
    }

    public void setUniv_facultate(String univ_facultate) {
        this.univ_facultate = univ_facultate;
    }

    public String getUniv_domeniu() {
        return univ_domeniu;
    }

    public void setUniv_domeniu(String univ_domeniu) {
        this.univ_domeniu = univ_domeniu;
    }

    public String getUniv_specializare() {
        return univ_specializare;
    }

    public void setUniv_specializare(String univ_specializare) {
        this.univ_specializare = univ_specializare;
    }

    public String getUniv_titlu() {
        return univ_titlu;
    }

    public void setUniv_titlu(String univ_titlu) {
        this.univ_titlu = univ_titlu;
    }

    public String getUniv_forma() {
        return univ_forma;
    }

    public void setUniv_forma(String univ_forma) {
        this.univ_forma = univ_forma;
    }

    public String getUniv_taxa() {
        return univ_taxa;
    }

    public void setUniv_taxa(String univ_taxa) {
        this.univ_taxa = univ_taxa;
    }

    public String getUniv_durata() {
        return univ_durata;
    }

    public void setUniv_durata(String univ_durata) {
        this.univ_durata = univ_durata;
    }

    public String getUniv_anabs() {
        return univ_anabs;
    }

    public void setUniv_anabs(String univ_anabs) {
        this.univ_anabs = univ_anabs;
    }

    public String getUniv_diploma() {
        return univ_diploma;
    }

    public void setUniv_diploma(String univ_diploma) {
        this.univ_diploma = univ_diploma;
    }

    public String getUniv_serie() {
        return univ_serie;
    }

    public void setUniv_serie(String univ_serie) {
        this.univ_serie = univ_serie;
    }

    public String getUniv_numar() {
        return univ_numar;
    }

    public void setUniv_numar(String univ_numar) {
        this.univ_numar = univ_numar;
    }

    public String getUniv_emis() {
        return univ_emis;
    }

    public void setUniv_emis(String univ_emis) {
        this.univ_emis = univ_emis;
    }

    public String getUniv_anemis() {
        return univ_anemis;
    }

    public void setUniv_anemis(String univ_anemis) {
        this.univ_anemis = univ_anemis;
    }

    public String getUniv_matricola() {
        return univ_matricola;
    }

    public void setUniv_matricola(String univ_matricola) {
        this.univ_matricola = univ_matricola;
    }

    public String getUniv_vizare() {
        return univ_vizare;
    }

    public void setUniv_vizare(String univ_vizare) {
        this.univ_vizare = univ_vizare;
    }

    public String getIdspecializare() {
        return idspecializare;
    }

    public void setIdspecializare(String idspecializare) {
        this.idspecializare = idspecializare;
    }

    public Integer getForma() {
        return forma;
    }

    public void setForma(Integer forma) {
        this.forma = forma;
    }

    public String getAnpregatitor() {
        return anpregatitor;
    }

    public void setAnpregatitor(String anpregatitor) {
        this.anpregatitor = anpregatitor;
    }

    public String getVolumul() {
        return volumul;
    }

    public void setVolumul(String volumul) {
        this.volumul = volumul;
    }

    public String getNr_mat() {
        return nr_mat;
    }

    public void setNr_mat(String nr_mat) {
        this.nr_mat = nr_mat;
    }

    public Boolean getExportweb() {
        return exportweb;
    }

    public void setExportweb(Boolean exportweb) {
        this.exportweb = exportweb;
    }

    public String getPromotia() {
        return promotia;
    }

    public void setPromotia(String promotia) {
        this.promotia = promotia;
    }

    public String getAnfinal() {
        return anfinal;
    }

    public void setAnfinal(String anfinal) {
        this.anfinal = anfinal;
    }

    public String getAnlic() {
        return anlic;
    }

    public void setAnlic(String anlic) {
        this.anlic = anlic;
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

    public Long getIduser() {
        return iduser;
    }

    public void setIduser(Long iduser) {
        this.iduser = iduser;
    }

    public Integer getTipstudent() {
        return tipstudent;
    }

    public void setTipstudent(Integer tipstudent) {
        this.tipstudent = tipstudent;
    }
}