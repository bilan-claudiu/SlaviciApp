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
    private String liceuLocalit;

    // varchar(25)
    @Column(name="liceu_tara",  length = 25)
    private String liceuTara;

    // varchar(25)
    @Column(name="liceu_judet",  length = 25)
    private String liceuJudet;

    // varchar(50)
    @Column(name="liceu_profil",  length = 50)
    private String liceuProfil;

    // varchar(20)
    @Column(name="liceu_durata",  length = 20)
    private String liceuDurata;

    // varchar(20)
    @Column(name="liceu_anabs",  length = 20)
    private String liceuAnabs;

    // varchar(25)
    @Column(name="liceu_forma",  length = 25)
    private String liceuForma;

    // varchar(50)
    @Column(name="liceu_diploma",  length = 50)
    private String liceuDiploma;

    // varchar(25)
    @Column(name="liceu_serie",  length = 25)
    private String liceuSerie;

    // varchar(25)
    @Column(name="liceu_numar",  length = 25)
    private String liceuNumar;

    // varchar(40)
    @Column(name="liceu_emis",  length = 40)
    private String liceuEmis;

    // varchar(5)
    @Column(name="liceu_anemis",  length = 5)
    private String liceuAnemis;

    // varchar(15)
    @Column(name="liceu_matricola",  length = 15)
    private String liceuMatricola;

    // varchar(30)
    @Column(name="liceu_vizare",  length = 30)
    private String liceuVizare;

    // float(5,2)
    @Column(name="liceu_bac")
    private Float liceuBac;

    // float(5,2)
    @Column(name="liceu_media")
    private Float liceuMedia;

    // varchar(25)
    @Column(name="univ_tara",  length = 25)
    private String univTara;

    // varchar(25)
    @Column(name="univ_localit",  length = 25)
    private String univLocalit;

    // varchar(25)
    @Column(name="univ_judet",  length = 25)
    private String univJudet;

    // varchar(50)
    @Column(name="univ_denumire",  length = 50)
    private String univDenumire;

    // varchar(50)
    @Column(name="liceu_denumire",  length = 50)
    private String liceuDenumire;

    // varchar(50)
    @Column(name="univ_facultate",  length = 50)
    private String univFacultate;

    // varchar(50)
    @Column(name="univ_domeniu",  length = 50)
    private String univDomeniu;

    // varchar(50)
    @Column(name="univ_specializare",  length = 50)
    private String univSpecializare;

    // varchar(50)
    @Column(name="univ_titlu",  length = 50)
    private String univTitlu;

    // varchar(15)
    @Column(name="univ_forma",  length = 15)
    private String univForma;

    // varchar(15)
    @Column(name="univ_taxa",  length = 15)
    private String univTaxa;

    // varchar(15)
    @Column(name="univ_durata",  length = 15)
    private String univDurata;

    // varchar(5)
    @Column(name="univ_anabs",  length = 5)
    private String univAnabs;

    // varchar(25)
    @Column(name="univ_diploma",  length = 25)
    private String univDiploma;

    // varchar(25
    @Column(name="univ_serie",  length = 25)
    private String univSerie;

    // varchar(25)
    @Column(name="univ_numar",  length = 25)
    private String univNumar;

    // varchar(25)
    @Column(name="univ_emis",  length = 25)
    private String univEmis;

    // varchar(5)
    @Column(name="univ_anemis",  length = 5)
    private String univAnemis;

    // varchar(15)
    @Column(name="univ_matricola",  length = 15)
    private String univMatricola;

    // varchar(30)
    @Column(name="univ_vizare",  length = 30)
    private String univVizare;

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
    private String nrMat;

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

    public String getLiceuLocalit() {
        return liceuLocalit;
    }

    public void setLiceuLocalit(String liceuLocalit) {
        this.liceuLocalit = liceuLocalit;
    }

    public String getLiceuTara() {
        return liceuTara;
    }

    public void setLiceuTara(String liceuTara) {
        this.liceuTara = liceuTara;
    }

    public String getLiceuJudet() {
        return liceuJudet;
    }

    public void setLiceuJudet(String liceuJudet) {
        this.liceuJudet = liceuJudet;
    }

    public String getLiceuProfil() {
        return liceuProfil;
    }

    public void setLiceuProfil(String liceuProfil) {
        this.liceuProfil = liceuProfil;
    }

    public String getLiceuDurata() {
        return liceuDurata;
    }

    public void setLiceuDurata(String liceuDurata) {
        this.liceuDurata = liceuDurata;
    }

    public String getLiceuAnabs() {
        return liceuAnabs;
    }

    public void setLiceuAnabs(String liceuAnabs) {
        this.liceuAnabs = liceuAnabs;
    }

    public String getLiceuForma() {
        return liceuForma;
    }

    public void setLiceuForma(String liceuForma) {
        this.liceuForma = liceuForma;
    }

    public String getLiceuDiploma() {
        return liceuDiploma;
    }

    public void setLiceuDiploma(String liceuDiploma) {
        this.liceuDiploma = liceuDiploma;
    }

    public String getLiceuSerie() {
        return liceuSerie;
    }

    public void setLiceuSerie(String liceuSerie) {
        this.liceuSerie = liceuSerie;
    }

    public String getLiceuNumar() {
        return liceuNumar;
    }

    public void setLiceuNumar(String liceuNumar) {
        this.liceuNumar = liceuNumar;
    }

    public String getLiceuEmis() {
        return liceuEmis;
    }

    public void setLiceuEmis(String liceuEmis) {
        this.liceuEmis = liceuEmis;
    }

    public String getLiceuAnemis() {
        return liceuAnemis;
    }

    public void setLiceuAnemis(String liceuAnemis) {
        this.liceuAnemis = liceuAnemis;
    }

    public String getLiceuMatricola() {
        return liceuMatricola;
    }

    public void setLiceuMatricola(String liceuMatricola) {
        this.liceuMatricola = liceuMatricola;
    }

    public String getLiceuVizare() {
        return liceuVizare;
    }

    public void setLiceuVizare(String liceuVizare) {
        this.liceuVizare = liceuVizare;
    }

    public Float getLiceuBac() {
        return liceuBac;
    }

    public void setLiceuBac(Float liceuBac) {
        this.liceuBac = liceuBac;
    }

    public Float getLiceuMedia() {
        return liceuMedia;
    }

    public void setLiceuMedia(Float liceuMedia) {
        this.liceuMedia = liceuMedia;
    }

    public String getUnivTara() {
        return univTara;
    }

    public void setUnivTara(String univTara) {
        this.univTara = univTara;
    }

    public String getUnivLocalit() {
        return univLocalit;
    }

    public void setUnivLocalit(String univLocalit) {
        this.univLocalit = univLocalit;
    }

    public String getUnivJudet() {
        return univJudet;
    }

    public void setUnivJudet(String univJudet) {
        this.univJudet = univJudet;
    }

    public String getUnivDenumire() {
        return univDenumire;
    }

    public void setUnivDenumire(String univDenumire) {
        this.univDenumire = univDenumire;
    }

    public String getLiceuDenumire() {
        return liceuDenumire;
    }

    public void setLiceuDenumire(String liceuDenumire) {
        this.liceuDenumire = liceuDenumire;
    }

    public String getUnivFacultate() {
        return univFacultate;
    }

    public void setUnivFacultate(String univFacultate) {
        this.univFacultate = univFacultate;
    }

    public String getUnivDomeniu() {
        return univDomeniu;
    }

    public void setUnivDomeniu(String univDomeniu) {
        this.univDomeniu = univDomeniu;
    }

    public String getUnivSpecializare() {
        return univSpecializare;
    }

    public void setUnivSpecializare(String univSpecializare) {
        this.univSpecializare = univSpecializare;
    }

    public String getUnivTitlu() {
        return univTitlu;
    }

    public void setUnivTitlu(String univTitlu) {
        this.univTitlu = univTitlu;
    }

    public String getUnivForma() {
        return univForma;
    }

    public void setUnivForma(String univForma) {
        this.univForma = univForma;
    }

    public String getUnivTaxa() {
        return univTaxa;
    }

    public void setUnivTaxa(String univTaxa) {
        this.univTaxa = univTaxa;
    }

    public String getUnivDurata() {
        return univDurata;
    }

    public void setUnivDurata(String univDurata) {
        this.univDurata = univDurata;
    }

    public String getUnivAnabs() {
        return univAnabs;
    }

    public void setUnivAnabs(String univAnabs) {
        this.univAnabs = univAnabs;
    }

    public String getUnivDiploma() {
        return univDiploma;
    }

    public void setUnivDiploma(String univDiploma) {
        this.univDiploma = univDiploma;
    }

    public String getUnivSerie() {
        return univSerie;
    }

    public void setUnivSerie(String univSerie) {
        this.univSerie = univSerie;
    }

    public String getUnivNumar() {
        return univNumar;
    }

    public void setUnivNumar(String univNumar) {
        this.univNumar = univNumar;
    }

    public String getUnivEmis() {
        return univEmis;
    }

    public void setUnivEmis(String univEmis) {
        this.univEmis = univEmis;
    }

    public String getUnivAnemis() {
        return univAnemis;
    }

    public void setUnivAnemis(String univAnemis) {
        this.univAnemis = univAnemis;
    }

    public String getUnivMatricola() {
        return univMatricola;
    }

    public void setUnivMatricola(String univMatricola) {
        this.univMatricola = univMatricola;
    }

    public String getUnivVizare() {
        return univVizare;
    }

    public void setUnivVizare(String univVizare) {
        this.univVizare = univVizare;
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

    public String getNrMat() {
        return nrMat;
    }

    public void setNrMat(String nrMat) {
        this.nrMat = nrMat;
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