package com.slavicifinal.demo.service;


import com.slavicifinal.demo.model.Student;
import com.slavicifinal.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {


    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Student saveStudent(Student newStudent) {
        return studentRepository.save(newStudent);
    }

    public List<Student> saveStudenti(List<Student> newStudenti) {
        return studentRepository.saveAll(newStudenti);
    }

    public Student getStudentById(Long id) {
        return studentRepository.findStudentById(id);
    }

    public Student getStudentByName(String name) {
        return studentRepository.findByName(name);
    }

    public Student getStudentByCNP(Long CNP) {
        return studentRepository.findByCNP(CNP);
    }

    public void deleteStudentByCNP(Long CNP) {
       studentRepository.deleteStudentByCNP(CNP);
    }

    public void deleteById(Long id) {
        studentRepository.deleteById(id);
    }

    public List<Student> getAllStudents (){
        return studentRepository.findAll();
    }


//    public Student updateStudent(Student student) {
//        Student existingStudent = studentRepository.findById(id);
//        existingStudent.setName(student.getName());
//        existingStudent.setPrenume((student.getPrenume()));
//        existingStudent.setAn(student.getAn());
//        existingStudent.setCNP(student.getCNP());
//        existingStudent.setEmail(student.getEmail());
//        existingStudent.setSpecializare(student.getSpecializare());
//        return studentRepository.save(existingStudent);
//    }

    public Student updateStudent(Student student) {
        return studentRepository.save(student);
    }
//    public void doHack(){
//        Student st= new Student();
//        st.setSpecializare("it");
//        st.setEmail("email.com");
//        st.setCNP("123445");
//        st.setPrenume("vasi;e");
//        st.setNume("ion");
//        st.setAn(2);
//        st.setParola("123");
//        studentRepository.save(st);
//
//    }


}
