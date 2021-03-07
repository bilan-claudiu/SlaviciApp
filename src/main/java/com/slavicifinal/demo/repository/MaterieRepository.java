package com.slavicifinal.demo.repository;

import com.slavicifinal.demo.model.Materie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MaterieRepository extends JpaRepository<Materie,Long>{

    Materie findMaterieById(Long id);
    Materie findMaterieByIduser(Long id);
<<<<<<< HEAD
    void deleteMaterieById(Long id);
=======
    void deleteById(Long id);

>>>>>>> 3fc1a16bc4db8e6e1b6dcfd0f3770119c61adc39

}
