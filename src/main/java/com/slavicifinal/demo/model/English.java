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
@Table(name = "english")
public class English implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "idden")
    private Long idden;

    //lung. max 20 caract.
<<<<<<< HEAD
    @Column(name = "tabel", length = 20)
    private String tabel;

    //lung. max 100 caract.
    @Column(name = "traducere", length = 100)
=======
    @Column(name = "tabel")
    private String tabel;

    //lung. max 100 caract.
    @Column(name = "traducere")
>>>>>>> 79456c37de1a7ca6b72bd74d3525ea674988facd
    private String traducere;
}