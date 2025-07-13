package com.lms.models.users;

import com.lms.models.BaseModel;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@MappedSuperclass
public abstract class User extends BaseModel {

    protected String name;

    protected String email;

    protected String role;
}
