package com.example.demo1.controller;

import com.example.demo1.model.User;
import com.example.demo1.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public ResponseEntity<User> save(@RequestBody User user) {
        User userAdded = userService.save(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(userAdded);
    }

    @GetMapping("/all")
    public ResponseEntity<List<User>> list() {
        List<User> users = userService.findAll();
        return ResponseEntity.ok(users);
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> findById(@PathVariable Long id) {
        User user = userService.findById(id);
        return ResponseEntity.ok(user);
    }

    @GetMapping
    public ResponseEntity<List<User>> findUsersByNameAndEmail(
            @RequestParam(required = false) String name,
            @RequestParam(required = false) String email) {
        List<User> users = userService.getUsersByNameAndEmail(name, email);
        return ResponseEntity.ok(users);
    }
}
