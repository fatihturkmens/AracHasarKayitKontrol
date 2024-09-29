package com.ArabaHasarKaydi.arabahasarkaydikontrol.repository;

import com.ArabaHasarKaydi.arabahasarkaydikontrol.entity.ArabaDetaylari;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArabDetaylariRepository extends JpaRepository<ArabaDetaylari,Long> {
    public ArabaDetaylari findByPlaka(String plaka);
    public ArabaDetaylari findByMarka(String marka);
    public ArabaDetaylari findByModel(String model);
}
