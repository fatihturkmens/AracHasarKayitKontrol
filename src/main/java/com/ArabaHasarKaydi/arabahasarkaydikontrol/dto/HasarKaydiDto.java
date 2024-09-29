package com.ArabaHasarKaydi.arabahasarkaydikontrol.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class HasarKaydiDto {

    private Long id;
    private double hasarkaydi;
    private LocalDate hasartarihi;
}
