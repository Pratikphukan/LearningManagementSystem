package com.lms.services;

import com.lms.dtos.CreateUserRequestDto;
import com.lms.models.users.User;

public class StudentService implements UserService {

    private static StudentService instance;

    private StudentService() {
        // Private constructor to prevent instantiation
    }

    public static StudentService getInstance() {
        if (instance == null) {
            instance = new StudentService();
        }
        return instance;
    }

    @Override
    public User createUser(CreateUserRequestDto createUserRequestDto) {
        return null;
    }
}
