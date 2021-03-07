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

    @GetMapping("/promotia/{promotia}")
    public ResponseEntity<List<Student>> getAllStudentsByPromotie(@PathVariable String promotia) {
        List<Student> studentsBypromotie = studentService.getStudentsByPromotie(promotia);
        return new ResponseEntity<>(studentsBypromotie, HttpStatus.OK);
    }

<<<<<<< HEAD
    @GetMapping("/cauta-id/{id}")
=======
    @GetMapping("/cauta/{id}")
>>>>>>> 3fc1a16bc4db8e6e1b6dcfd0f3770119c61adc39
    public ResponseEntity<Student> getStudentById(@PathVariable Long id) {
        Student student = studentService.getStudentById(id);
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

<<<<<<< HEAD
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
        studentService.deleteStudentById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

=======
    @PostMapping("/adauga")
    public ResponseEntity<Student> adaugaStudent(@RequestBody Student student) {
        Student newStudent = studentService.saveStudent(student);
        return new ResponseEntity<>(newStudent, HttpStatus.CREATED);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Student> updateStudent(@RequestBody Student student, @PathVariable Long id) {
        Student updateStudent = studentService.updateStudent(student,id);
        return new ResponseEntity<>(updateStudent, HttpStatus.OK);
    }

    @PostMapping("/adauga-grup")
    public ResponseEntity<List<Student>> adaugaStudenti(@RequestBody List<Student> studenti) {
        List<Student> studentList = studentService.saveStudents(studenti);
        return new ResponseEntity<>(studentList, HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Student> deleteStudentById(@PathVariable Long id) {
        studentService.deleteStudentById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

>>>>>>> 3fc1a16bc4db8e6e1b6dcfd0f3770119c61adc39
}
