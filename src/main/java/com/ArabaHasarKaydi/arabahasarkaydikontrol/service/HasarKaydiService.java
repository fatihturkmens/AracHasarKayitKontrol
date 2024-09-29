package com.ArabaHasarKaydi.arabahasarkaydikontrol.service;

import com.ArabaHasarKaydi.arabahasarkaydikontrol.dto.HasarKaydiDto;
import com.ArabaHasarKaydi.arabahasarkaydikontrol.entity.HasarKaydi;

public interface HasarKaydiService {
    public String ekle(HasarKaydiDto hasarKaydiDto);
    public String silme(Long id);

}
