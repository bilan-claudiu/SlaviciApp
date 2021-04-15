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
    @Column(name = "tabel")
    private String tabel;

    //lung. max 100 caract.
    @Column(name = "traducere")
    private String traducere;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdden() {
        return idden;
    }

    public void setIdden(Long idden) {
        this.idden = idden;
    }

    public String getTabel() {
        return tabel;
    }

    public void setTabel(String tabel) {
        this.tabel = tabel;
    }

    public String getTraducere() {
        return traducere;
    }

    public void setTraducere(String traducere) {
        this.traducere = traducere;
    }
}
