package com.example.demo1.service;

import com.example.demo1.exception.UserNotFoundException;
import com.example.demo1.model.User;
import com.example.demo1.repository.UserRepository;
import com.example.demo1.repository.spec.UserSpecification;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User save(User user) {
        return userRepository.save(user);
    }

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public User findById(Long id) {
        return userRepository.findById(id)
                .orElseThrow(() -> new UserNotFoundException("User " + id + " not found."));
    }

    public List<User> getUsersByNameAndEmail(String name, String email) {
        Specification<User> spec = UserSpecification.nameHas(name)
                .and(UserSpecification.emailHas(email));

        return userRepository.findAll(spec);
    }
}
