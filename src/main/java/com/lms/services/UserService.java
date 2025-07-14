package com.lms.services;

import com.lms.dtos.CreateUserRequestDto;
import com.lms.models.users.User;

public interface UserService {

    User createUser(CreateUserRequestDto createUserRequestDto);
}
