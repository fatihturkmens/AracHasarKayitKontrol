package com.ArabaHasarKaydi.arabahasarkaydikontrol.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ArabaDetaylari {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany
    private List<HasarKaydi> hasarkaydi;

    private String plaka;
    private String  marka;
    private double yil;
    private String model;
    private double km;
    private String renk;



}
