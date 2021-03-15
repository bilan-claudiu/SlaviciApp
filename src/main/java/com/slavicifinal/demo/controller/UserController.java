package com.slavicifinal.demo.controller;

import com.slavicifinal.demo.model.Users;
import com.slavicifinal.demo.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UsersService usersService;

    @Autowired
    public UserController(UsersService usersService) {
        this.usersService = usersService;
    }

    @GetMapping()
    public ResponseEntity<List<Users>> getAllUsers() {
        List<Users> usersList = usersService.getAllUsers();
        return new ResponseEntity<>(usersList, HttpStatus.OK);
    }

    @GetMapping("/cauta/{id}")
    public ResponseEntity<Users> getUserById(@PathVariable Long id) {
        Users user = usersService.getUserById(id);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    @GetMapping("/cauta-nume/{nume}")
    public ResponseEntity<Users> getUserByNume(@PathVariable String nume) {
        Users user = usersService.getUserByNume(nume);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    @GetMapping("/cauta-prenume/{prenume}")
    public ResponseEntity<Users> getUserByPrenume(@PathVariable String prenume) {
        Users user = usersService.getUserByPrenume(prenume);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    @GetMapping("/cauta-cnp/{cnp}")
    public ResponseEntity<Users> getUserByCnp(@PathVariable String cnp) {
        Users user = usersService.getUserByCNP(cnp);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    @GetMapping("/cauta-tel/{tel}")
    public ResponseEntity<Users> getUserByTel(@PathVariable String tel) {
        Users user = usersService.getUserByTel(tel);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    @PostMapping("/adauga")
    public ResponseEntity<Users> adaugaUser(@RequestBody Users user) {
        Users newUser = usersService.saveUser(user);
        return new ResponseEntity<>(newUser, HttpStatus.CREATED);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Users> updateUsers(@RequestBody Users user, @PathVariable Long id) {
        Users updateUser = usersService.updateUser(user, id);
        return new ResponseEntity<>(updateUser, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Users> deleteUserById(@PathVariable Long id) {
        usersService.deleteUsersById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
