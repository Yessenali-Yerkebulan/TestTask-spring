package com.example.service;

import com.example.entity.UserEntity;
import com.example.repo.UserRepo;
import lombok.AllArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class UserService {
        UserRepo userRepo;
        private BCryptPasswordEncoder encoder(){
            return new BCryptPasswordEncoder();
        }
        public void saveUser(UserEntity userEntity){
            userEntity.setPassword(encoder().encode(userEntity.getPassword()));
            userRepo.save(userEntity);
        }

    public Object getAll() {
            return userRepo.findAll();
    }

    public void delete(Long id){
            userRepo.deleteById(id);
    }
}
