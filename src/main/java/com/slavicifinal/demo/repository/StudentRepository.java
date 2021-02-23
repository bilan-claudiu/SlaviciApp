package com.slavicifinal.demo.repository;

import com.slavicifinal.demo.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface StudentRepository extends JpaRepository<Student,Long> {

    Student findStudentById (Long id);
    Student findStudentByIduser(Long idUser);
    Student findStudentByNactual (String nactual);
    Student findStudentByCnp(String cnp);
    Student findStudentBySerieid(String serieId);
    Student findStudentByEmail(String email);
    Student findStudentByIdspecializare(String specializare);
    List<Student> findStudentsByPromotia(String promotie);

    void  deleteStudentById (Long id);
}
