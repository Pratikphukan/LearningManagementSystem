package com.lms.models.content;

import com.lms.models.performance.StudentCourseProgressTracker;
import com.lms.models.users.Instructor;
import com.lms.models.users.Student;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Course extends Content {

    @ManyToOne
    private Instructor instructor;

    @ManyToMany
    @JoinTable(name = "course_student_mapping",
            joinColumns = @JoinColumn(name = "course_id"),
            inverseJoinColumns = @JoinColumn(name = "student_id"))
    private List<Student> students;

    @OneToMany(mappedBy = "course")
    private List<Module> modules;

    @OneToMany(mappedBy = "course")
    private List<StudentCourseProgressTracker> studentCourseProgressTrackers;
}
