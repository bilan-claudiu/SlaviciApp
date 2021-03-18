package com.slavicifinal.demo.repository;

import com.slavicifinal.demo.model.Universitati;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UniversitatiRepository extends JpaRepository<Universitati, Long> {

    Universitati findUniversitatiById(Long id);

    Universitati findUniversitatiByNume(String nume);

    Universitati findUniversitatiBySpecializarea(int specializarea);

    Universitati findUniversitatiByNumespec(String numespec);


    void deleteById(Long id);
}
