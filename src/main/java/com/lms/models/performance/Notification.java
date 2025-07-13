package com.lms.models.performance;

import com.lms.models.BaseModel;
import com.lms.models.users.Instructor;
import com.lms.models.users.Student;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Notification extends BaseModel {

    @ManyToOne
    private Instructor instructor;

    @ManyToOne
    private Student student;

    private String message;
}
