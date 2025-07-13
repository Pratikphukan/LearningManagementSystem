package com.lms.models.users;

import com.lms.models.BaseModel;
import com.lms.models.performance.Notification;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@MappedSuperclass
public abstract class User extends BaseModel {

    protected String name;

    protected String email;

    protected String role;
}
