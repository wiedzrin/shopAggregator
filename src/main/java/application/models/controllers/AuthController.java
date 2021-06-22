package application.models.controllers;

import application.models.dao.UserDao;
import application.models.dao.repo.UserRepo;
import application.models.dto.UserDto;
import application.models.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class AuthController {
    @Autowired
    private UserRepo userRepo;

    @Autowired
    private UserDao userDao;

    @PostMapping("register")
    public ResponseEntity<User> addUser(@RequestBody User user) {
        userRepo.save(user);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    @PostMapping("login")
    public void login(@RequestBody UserDto user) {
        System.out.println(userDao.checkUser(user.getUsername(), user.getPassword()));
    }
//    @GetMapping("login")
//    public ResponseEntity<UserDto>
}