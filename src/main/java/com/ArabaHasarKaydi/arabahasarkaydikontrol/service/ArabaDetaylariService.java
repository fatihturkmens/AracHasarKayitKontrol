package com.ArabaHasarKaydi.arabahasarkaydikontrol.service;

import com.ArabaHasarKaydi.arabahasarkaydikontrol.dto.ArabaDetaylariDto;
import com.ArabaHasarKaydi.arabahasarkaydikontrol.entity.ArabaDetaylari;

import java.util.List;

public interface ArabaDetaylariService {
    public String ekle(ArabaDetaylariDto arabaDetaylariDto);
    public List<ArabaDetaylari> all();
    public ArabaDetaylari plaka(String plaka);
    public ArabaDetaylari marka(String marka);
    public ArabaDetaylari model(String model);
    public String aracbilgisilme(Long id);

}
