package com.spring.login.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true) // 유일한 값만 저장
    private String username;

    private String password;

    @Column(unique = true)
    private String email;
}
