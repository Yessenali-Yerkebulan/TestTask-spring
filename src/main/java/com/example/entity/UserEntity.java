package com.example.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@Table(name="userEntity")
@AllArgsConstructor
@NoArgsConstructor
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String password;
    private ERole role = ERole.USER_ROLE;

}
