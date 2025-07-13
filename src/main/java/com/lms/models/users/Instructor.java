package com.lms.models.users;

import com.lms.models.content.Course;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;

import java.util.List;

@Getter
@Entity
public class Instructor extends User {

    @OneToMany(mappedBy = "instructor")
    private List<Course> courses;
}
