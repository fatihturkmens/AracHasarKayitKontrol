package com.ArabaHasarKaydi.arabahasarkaydikontrol.controller;

import com.ArabaHasarKaydi.arabahasarkaydikontrol.dto.ArabaDetaylariDto;
import com.ArabaHasarKaydi.arabahasarkaydikontrol.entity.ArabaDetaylari;
import com.ArabaHasarKaydi.arabahasarkaydikontrol.serviceİmpl.ArabaDetaylariServiceİmpl;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/car")
public class ArabaDetaylariController {

    @Autowired
    private ArabaDetaylariServiceİmpl arabaDetaylariServiceİmpl;


    @PostMapping("/ekle")
    public ResponseEntity<String> ekle(@RequestBody @Valid ArabaDetaylariDto arabaDetaylariDto){
        arabaDetaylariServiceİmpl.ekle(arabaDetaylariDto);
        return new ResponseEntity<>("Araç bilgisi oluşturuldu", HttpStatus.CREATED);
    }
    @GetMapping("/all")
    public ResponseEntity<List<ArabaDetaylari>> all(){
        List<ArabaDetaylari> list =arabaDetaylariServiceİmpl.all();
        return new ResponseEntity<>(list,HttpStatus.OK);
    }
    @GetMapping("/plaka")
    public ResponseEntity<ArabaDetaylari> plaka(@RequestParam String plaka){
        ArabaDetaylari arabaDetaylari =arabaDetaylariServiceİmpl.plaka(plaka);
       return new ResponseEntity<>(arabaDetaylari,HttpStatus.OK);
    }
    @GetMapping("/marka")
    public ResponseEntity<ArabaDetaylari> marka(@RequestParam String marka){
        ArabaDetaylari arabaDetaylari =arabaDetaylariServiceİmpl.marka(marka);
        return new ResponseEntity<>(arabaDetaylari,HttpStatus.OK) ;
    }
    @GetMapping("/model")
    public ResponseEntity<ArabaDetaylari> model(@RequestParam String model){
        ArabaDetaylari arabaDetaylari =arabaDetaylariServiceİmpl.model(model);
        return new ResponseEntity<>(arabaDetaylari,HttpStatus.OK);
    }
        @DeleteMapping("/sil/{id}")
    public ResponseEntity<String> silme(@PathVariable Long id){
        arabaDetaylariServiceİmpl.aracbilgisilme(id);
        return new ResponseEntity<>("araç bilgileri silindi",HttpStatus.OK);
    }
}
