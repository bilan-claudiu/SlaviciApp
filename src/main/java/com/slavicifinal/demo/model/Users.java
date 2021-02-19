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
    private String user;

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
    private int viz_date;

    //tinyint(1)
    @Column(name="intro_stud")
    private short intro_stud;

    //tinyint(1)
    @Column(name="intro_note")
    private short intro_note;

    //tinyint(1)
    @Column(name="echivalari")
    private short echivalari;

    //tinyint(1)
    @Column(name="transfer")
    private short transfer;

    //tinyint(1)
    @Column(name="citiredate")
    private short citiredate;

    //tinyint(1)
    @Column(name="intro_date_ani")
    private short intro_date_ani;

    //int
    @Column(name="status")
    private int status;

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
}