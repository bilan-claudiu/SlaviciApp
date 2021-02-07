package com.slavicifinal.demo.repository;

import com.slavicifinal.demo.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Integer> {



    Student findByName(String name);
    Student findById ( int id);
    Student findByCNP ( Long CNP);
    void deleteStudentByCNP(Long CNP);
    void deleteById(int id);
}

