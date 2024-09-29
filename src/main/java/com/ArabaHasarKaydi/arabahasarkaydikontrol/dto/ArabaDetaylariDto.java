package com.ArabaHasarKaydi.arabahasarkaydikontrol.dto;

import com.ArabaHasarKaydi.arabahasarkaydikontrol.entity.HasarKaydi;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ArabaDetaylariDto {

    private Long id;
    private List<HasarKaydi> hasarkaydi;

    @NotEmpty(message = "Plaka boş bırakılamaz")
    @Size(min = 3,max = 30)
    private String plaka;

    @NotEmpty(message = "Marka adı boş bırakılamaz")
    @Size(min = 3,max = 30)
    private String  marka;

    private double yil;

    @NotEmpty(message = "Model boş bırakılamaz")
    @Size(min = 3,max = 30)
    private String model;

    private double km;
    private String renk;
}
