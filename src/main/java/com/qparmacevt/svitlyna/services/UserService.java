package com.qparmacevt.svitlyna.services;

import com.qparmacevt.svitlyna.models.Users;
import com.qparmacevt.svitlyna.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<Users> getAllUsers() {
        return userRepository.findAll();
    }

    public Users getUserById(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    public Users createUser(Users user) {
        return userRepository.save(user);
    }

    public Users updateUser(Long id, Users user) {
        Optional<Users> userOptional = userRepository.findById(id);
        return user;
    }

    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }

}
