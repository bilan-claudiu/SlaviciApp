package com.slavicifinal.demo.service;

import com.slavicifinal.demo.model.Users;
import com.slavicifinal.demo.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.List;

@Service
public class UsersService {

    private final UsersRepository usersRepository;

    @Autowired
    public UsersService(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    public Users saveUser(Users user) {
        LocalDate now = LocalDate.now();
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        final SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        user.setDatamod(now);
        user.setTimemod(sdf.format(timestamp));
        return usersRepository.save(user);
    }

    public Users getUserById(Long id) {
        return usersRepository.findUsersById(id);
    }

    public Users getUserByNume(String nume) {
        return usersRepository.findUsersByNume(nume);
    }

    public Users getUserByPrenume(String prenume) {
        return usersRepository.findUsersByPrenume(prenume);
    }

    public Users getUserByCNP(String cnp) {
        return usersRepository.findUsersByCnp(cnp);
    }

    public Users getUserByTel(String tel) {
        return usersRepository.findUsersByTel(tel);
    }

    public void deleteUsersById(Long id) {
        usersRepository.deleteById(id);
}

    public List<Users> getAllUsers() {
        return usersRepository.findAll();
    }


    public Users updateUser(Users newUser, Long id) {
        return usersRepository.findById(id).map(users -> {

            //automat generate datamood and timemood
            LocalDate now = LocalDate.now();
            Timestamp timestamp = new Timestamp(System.currentTimeMillis());
            final SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
            users.setDatamod(now);
            users.setTimemod(sdf.format(timestamp));
            users.setCitiredate(newUser.getCitiredate());
            users.setCnp(newUser.getCnp());
            users.setDomiciliu(newUser.getDomiciliu());
            users.setEchivalari(newUser.getEchivalari());
            users.setIntroDate(newUser.getIntroDate());
            users.setIntroDateAni(newUser.getIntroDateAni());
            users.setIntroNote(newUser.getIntroNote());
            users.setIntroStud(newUser.getIntroStud());
            users.setNrbi(newUser.getNrbi());
            users.setNume(newUser.getNume());
            users.setObservatii(newUser.getObservatii());
            users.setPasswd(newUser.getPasswd());
            users.setPoza(newUser.getPoza());
            users.setPrenume(newUser.getPrenume());
            users.setSeriebi(newUser.getSeriebi());
            users.setStartDate(newUser.getStartDate());
            users.setStatus(newUser.getStatus());
            users.setStopDate(newUser.getStopDate());
            users.setTel(newUser.getTel());
            users.setTransfer(newUser.getTransfer());
            users.setUser(newUser.getUser());
            users.setVizDate(newUser.getVizDate());

            return usersRepository.save(users);
        }).orElseGet(() -> {
            newUser.setId(id);
            return usersRepository.save(newUser);
        });
    }

}



