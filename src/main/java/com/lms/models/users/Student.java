package com.lms.models.users;

import com.lms.models.content.Course;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import lombok.Getter;

import java.util.List;

@Getter
@Entity
public class Student extends User {

    @ManyToMany(mappedBy = "students")
    private List<Course> enrolledCourses;
}
