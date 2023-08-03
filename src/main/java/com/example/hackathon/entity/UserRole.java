package com.spring.login.entity;

import lombok.Getter;


@Getter // 상수 자료형이라 setter 없이 getter만
public enum UserRole {
    ADMIN("ROLE_ADMIN"), // 권한 부어
    USER("ROLE_USER");

    UserRole(String value) {
        this.value = value;
    }

    private String value;
}

