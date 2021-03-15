package com.slavicifinal.demo.repository;

import com.slavicifinal.demo.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<Users, Long> {

    Users findUsersById(Long id);

    Users findUsersByNume(String nume);

    Users findUsersByPrenume(String prenume);

    Users findUsersByCnp(String cnp);

    Users findUsersByTel(String tel);

    void deleteById(Long id);

}
