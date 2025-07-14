package com.lms.controllers;

import com.lms.dtos.CreateUserRequestDto;
import com.lms.dtos.CreateUserResponseDto;
import com.lms.dtos.ResponseDto;
import com.lms.dtos.ResponseStatus;
import com.lms.factory.UserServiceFactory;
import com.lms.models.users.User;
import com.lms.services.UserService;

public class UserController {

    private static UserController instance;

    private UserController() {
        // Private constructor to prevent instantiation
    }

    public static UserController getInstance() {
        if (instance == null) {
            instance = new UserController();
        }
        return instance;
    }

    public ResponseDto<CreateUserResponseDto> createUser(CreateUserRequestDto request) {
        // Logic to create a user
        // This is a placeholder implementation
        UserService userService = UserServiceFactory.getUserService(request.getUserType().getUserType());
        User user = userService.createUser(request);

        CreateUserResponseDto response = new CreateUserResponseDto("User created successfully", user.getId());
        return new ResponseDto<>("Success", response, ResponseStatus.SUCCESS);
    }
}
