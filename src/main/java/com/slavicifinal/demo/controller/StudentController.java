package com.slavicifinal.demo.controller;

import com.slavicifinal.demo.model.Student;
import com.slavicifinal.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }


    @GetMapping()
    public ResponseEntity<List<Student>> getAllStudents() {
        List<Student> students = studentService.getAllStudents();
        return new ResponseEntity<>(students, HttpStatus.OK);
    }

    @GetMapping("/promotia")
    public ResponseEntity<List<Student>> getAllStudentsByPromotie(@PathVariable String promotie) {
        List<Student> studentsBypromotie = studentService.getStudentsByPromotie(promotie);
        return new ResponseEntity<>(studentsBypromotie, HttpStatus.OK);
    }

    @GetMapping("/cauta-id/{id}")
    public ResponseEntity<Student> getStudentById(@PathVariable Long Id) {
        Student student = studentService.getStudentById(Id);
        return new ResponseEntity<>(student, HttpStatus.OK);
    }

    @GetMapping("/cauta-iduser/{idUser}")
    public ResponseEntity<Student> getStudentByIdUser(@PathVariable Long idUser) {
        Student student = studentService.getStudentByIduser(idUser);
        return new ResponseEntity<>(student, HttpStatus.OK);
    }

    @GetMapping("/cauta-cnp/{cnp}")
    public ResponseEntity<Student> getStudentByCnp(@PathVariable String cnp) {
        Student student = studentService.getStudentByCnp(cnp);
        return new ResponseEntity<>(student, HttpStatus.OK);
    }

    @GetMapping("/cauta-nume/{nactual}")
    public ResponseEntity<Student> getStudentByNume(@PathVariable String nactual) {
        Student student = studentService.getStudentByNume(nactual);
        return new ResponseEntity<>(student, HttpStatus.OK);
    }

    @GetMapping("/cauta-serieId/{serieId}")
    public ResponseEntity<Student> getStudentBySerieId(@PathVariable String serieId) {
        Student student = studentService.getStudentBySerieId(serieId);
        return new ResponseEntity<>(student, HttpStatus.OK);
    }

    @GetMapping("/cauta-email/{email}")
    public ResponseEntity<Student> getStudentByEmail(@PathVariable String email) {
        Student student = studentService.getStudentByEmail(email);
        return new ResponseEntity<>(student, HttpStatus.OK);
    }

    @GetMapping("/cauta-specializare/{specializare}")
    public ResponseEntity<Student> getStudentByIdSpecializare(@PathVariable String specializare) {
        Student student = studentService.getStudentByIdSpecializare(specializare);
        return new ResponseEntity<>(student, HttpStatus.OK);
    }

    @PostMapping("/adauga-student")
    public ResponseEntity<Student> adaugaStudent(@RequestBody Student student) {
        Student newStudent = studentService.saveStudent(student);
        return new ResponseEntity<>(newStudent, HttpStatus.CREATED);
    }

    @PutMapping("/update-student")
    public ResponseEntity<Student> updateStudent(@RequestBody Student student) {
        Student updateStudent = studentService.saveStudent(student);
        return new ResponseEntity<>(updateStudent, HttpStatus.OK);
    }

    @PostMapping("/adauga-grup")
    public ResponseEntity<List<Student>> adaugaStudenti(@RequestBody List<Student> studenti) {
        List<Student> studentList = studentService.saveStudents(studenti);
        return new ResponseEntity<>(studentList, HttpStatus.CREATED);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Student> deleteStudentById(@PathVariable Long id) {
        Student student = studentService.getStudentById(id);
        studentService.deleteStudentById(student.getId());
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
