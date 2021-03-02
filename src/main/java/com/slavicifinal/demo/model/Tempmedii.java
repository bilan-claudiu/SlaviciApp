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
@Table(name = "tempmedii")

public class Tempmedii implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //bigint
    @Column(name="idstud")
    private Long idstud;

    //float(5,2)
    @Column(name="medie")
    private Float medie;

    //int
    @Column(name="credite")
<<<<<<< HEAD
    private int credite;
=======
    private Integer credite;
>>>>>>> 00ba1cb7ae9e2656391b506277d742fec6e53dad
}