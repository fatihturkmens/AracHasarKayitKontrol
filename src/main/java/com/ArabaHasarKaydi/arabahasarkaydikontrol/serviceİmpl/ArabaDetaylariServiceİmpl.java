package com.ArabaHasarKaydi.arabahasarkaydikontrol.serviceİmpl;

import com.ArabaHasarKaydi.arabahasarkaydikontrol.dto.ArabaDetaylariDto;
import com.ArabaHasarKaydi.arabahasarkaydikontrol.dto.HasarKaydiDto;
import com.ArabaHasarKaydi.arabahasarkaydikontrol.entity.ArabaDetaylari;
import com.ArabaHasarKaydi.arabahasarkaydikontrol.entity.HasarKaydi;
import com.ArabaHasarKaydi.arabahasarkaydikontrol.repository.ArabDetaylariRepository;
import com.ArabaHasarKaydi.arabahasarkaydikontrol.service.ArabaDetaylariService;
import jakarta.persistence.EntityNotFoundException;
import jakarta.persistence.OneToMany;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ArabaDetaylariServiceİmpl implements ArabaDetaylariService {

    @Autowired
    private ArabDetaylariRepository arabDetaylariRepository;

    private String dtomapper(ArabaDetaylari arabaDetaylari, ArabaDetaylariDto arabaDetaylariDto) {
        arabaDetaylari.setId(arabaDetaylariDto.getId());
        arabaDetaylari.setHasarkaydi(arabaDetaylariDto.getHasarkaydi());

        arabaDetaylari.setPlaka(arabaDetaylariDto.getPlaka());
        arabaDetaylari.setMarka(arabaDetaylariDto.getMarka());
        arabaDetaylari.setYil(arabaDetaylariDto.getYil());
        arabaDetaylari.setModel(arabaDetaylariDto.getModel());
        arabaDetaylari.setKm(arabaDetaylariDto.getKm());
        arabaDetaylari.setRenk(arabaDetaylariDto.getRenk());
        return "araç ve hasar kayıt bilgileri eklenmiştir";
    }


    public String ekle(ArabaDetaylariDto arabaDetaylariDto) {
        return dtomapper(new ArabaDetaylari(), arabaDetaylariDto);
    }

    public List<ArabaDetaylari> all() {
        return arabDetaylariRepository.findAll();
    }

    public ArabaDetaylari plaka(String plaka) {
        ArabaDetaylari arabaDetaylari = arabDetaylariRepository.findByPlaka(plaka);
        return arabaDetaylari;
    }

    public ArabaDetaylari marka(String marka) {
        ArabaDetaylari arabaDetaylari = arabDetaylariRepository.findByMarka(marka);
        return arabaDetaylari;
    }

    public ArabaDetaylari model(String model) {
        ArabaDetaylari arabaDetaylari = arabDetaylariRepository.findByModel(model);
        return arabaDetaylari;
    }

   public String aracbilgisilme(Long id) {
        Optional<ArabaDetaylari> arabaDetaylari = arabDetaylariRepository.findById(id);
        if (arabaDetaylari.isPresent()) {
            arabDetaylariRepository.deleteById(id);
            return "Araç bilgileri sildi";
        } else {
            throw new EntityNotFoundException("Araç bilgileri bulunamadı");
        }

    }

}

