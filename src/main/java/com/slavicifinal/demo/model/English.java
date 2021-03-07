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
<<<<<<< HEAD
    @Column(name = "tabel", length = 20)
    private String tabel;

    //lung. max 100 caract.
    @Column(name = "traducere", length = 100)
    private String traducere;
}
=======
    @Column(name = "tabel")
    private String tabel;

    //lung. max 100 caract.
    @Column(name = "traducere")
    private String traducere;
}
>>>>>>> 00ba1cb7ae9e2656391b506277d742fec6e53dad
=======
    @Column(name = "tabel")
    private String tabel;

    //lung. max 100 caract.
    @Column(name = "traducere")
    private String traducere;
}
>>>>>>> 3fc1a16bc4db8e6e1b6dcfd0f3770119c61adc39
