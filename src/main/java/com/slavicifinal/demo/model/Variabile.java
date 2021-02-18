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
@Table(name = "variabile")
public class Variabile implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // varchar 20
    @Column(name="name", length = 20)
    private String name;

    // varchar 30
    @Column(name="value", length = 30)
    private String value;
}