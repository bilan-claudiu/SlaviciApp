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


    private StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }
//    @RequestMapping(value="/lista-studenti",method = RequestMethod.GET) // sau @GetMapping
//    public List<Student> getAllStudents() {
//       /* studentService.doHack();*/
//        return studentService.getAllStudents();
//    }


    @PostMapping("/adauga-student")
    public ResponseEntity<Student> addNewStudent(@RequestBody Student student) {
        Student newStudent = studentService.saveStudent(student);
        return new ResponseEntity<>(student, HttpStatus.OK);
    }

    @PostMapping("/adauga-grup")
    public ResponseEntity<List<Student>> addNewStudents(@RequestBody List<Student> studentList) {
        List<Student> students = studentService.saveStudenti(studentList);
        return new ResponseEntity<>(students, HttpStatus.OK);
    }

    @GetMapping()
    public ResponseEntity<List<Student>> getAllStudents() {
        List<Student> students = studentService.getAllStudents();
        return new ResponseEntity<>(students, HttpStatus.OK);
    }


    @GetMapping("/cauta-nume/{name}")
    public ResponseEntity<Student> getStudentByName(@PathVariable String name) {
        Student student = studentService.getStudentByName(name);
        return new ResponseEntity<>(student, HttpStatus.OK);
    }

    @GetMapping("/cauta-CNP/{CNP}")
    public ResponseEntity<Student> getStudentByCNP(@PathVariable Long CNP) {
        Student newStudent = studentService.getStudentByCNP(CNP);
        return new ResponseEntity<>(newStudent, HttpStatus.OK);
    }

    @GetMapping("/cauta-id/{id}")
    public ResponseEntity<Student> getStudentById(@PathVariable int id) {
        Student student = studentService.getStudentById(id);
        return new ResponseEntity<>(student, HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<Student> updateStudent(@RequestBody Student student) {
        Student newStudent = studentService.saveStudent(student);
        return new ResponseEntity<>(newStudent, HttpStatus.OK);

    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Student> deleteStudentById(@PathVariable("id") int id) {
        studentService.deleteStudentById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping("/delete-CNP/{CNP}")
    public ResponseEntity<Student>deleteStudentByCNP(@PathVariable("CNP") Long CNP) {
        studentService.deleteStudentByCNP(CNP);
        return new ResponseEntity<>(HttpStatus.OK);
    }


}

