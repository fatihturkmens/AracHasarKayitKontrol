package com.ArabaHasarKaydi.arabahasarkaydikontrol.controller;

import com.ArabaHasarKaydi.arabahasarkaydikontrol.dto.HasarKaydiDto;
import com.ArabaHasarKaydi.arabahasarkaydikontrol.entity.HasarKaydi;
import com.ArabaHasarKaydi.arabahasarkaydikontrol.service.HasarKaydiService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hasarkayit")
public class HasarKaydiController {

    @Autowired
    private HasarKaydiService hasarKaydiService;

    @PostMapping("/ekle")
    public ResponseEntity<String> ekle(@RequestBody @Valid HasarKaydiDto hasarKaydiDto){
        hasarKaydiService.ekle(hasarKaydiDto);
        return new ResponseEntity<>("Hasar kayıt bilgisi oluşturuldu", HttpStatus.OK);
    }
}
