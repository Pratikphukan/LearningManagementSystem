package com.lms.models;

import lombok.Getter;

@Getter
public enum UserType {

    STUDENT("student"),
    INSTRUCTOR("instructor"),
    ADMIN("admin");

    private final String userType;

    UserType(String userType) {
        this.userType = userType;
    }
}
