package com.lms.dtos;

import com.lms.models.UserType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateUserRequestDto {

    private String name;

    private String email;

    private String password;

    private UserType userType;
}
