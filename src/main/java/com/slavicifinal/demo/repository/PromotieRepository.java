package com.slavicifinal.demo.repository;

import com.slavicifinal.demo.model.Promotie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PromotieRepository extends JpaRepository<Promotie,Long> {
    Promotie findPromotieById (Long id);
    Promotie findPromotieByNume(int Nume);
    void deleteById(Long id);
}
