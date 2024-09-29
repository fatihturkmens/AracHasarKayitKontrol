package com.ArabaHasarKaydi.arabahasarkaydikontrol.serviceİmpl;

import com.ArabaHasarKaydi.arabahasarkaydikontrol.dto.HasarKaydiDto;
import com.ArabaHasarKaydi.arabahasarkaydikontrol.entity.HasarKaydi;
import com.ArabaHasarKaydi.arabahasarkaydikontrol.repository.HasarKaydiRepository;
import com.ArabaHasarKaydi.arabahasarkaydikontrol.service.HasarKaydiService;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class HasarKaydiServiceİmpl implements HasarKaydiService {

    @Autowired
    private HasarKaydiRepository hasarKaydiRepository;


    private String dtomapper(HasarKaydi hasarKaydi, HasarKaydiDto hasarKaydiDto){
        hasarKaydi.setId(hasarKaydiDto.getId());
        hasarKaydi.setHasarkaydi(hasarKaydiDto.getHasarkaydi());
        hasarKaydi.setHasartarihi(hasarKaydiDto.getHasartarihi());
        hasarKaydiRepository.save(hasarKaydi);
        return "Hasar kayıt bilgileri kaydedildi";
    }


    public String ekle(HasarKaydiDto hasarKaydiDto){
        return dtomapper(new HasarKaydi(),hasarKaydiDto);
    }
    public String silme(Long id) {
        Optional<HasarKaydi> hasarKaydi = hasarKaydiRepository.findById(id);
        if (hasarKaydi.isPresent()) {
            hasarKaydiRepository.deleteById(id);
            return "Hasar kayıt bilgileri silinmiştir";
        } else {
            throw new EntityNotFoundException("Hasar kayıt bilgileri bulunamadı");
        }
    }
}
