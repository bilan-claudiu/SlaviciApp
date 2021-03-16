package com.slavicifinal.demo.repository;

import com.slavicifinal.demo.model.Promotie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PromotieRepository extends JpaRepository<Promotie,Long> {
    Promotie findPromotieById (Long id);
    Promotie findPromotieByNume(String Nume);
    void deleteById(Long id);
}
