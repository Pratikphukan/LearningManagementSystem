package com.lms.models.users;

import com.lms.models.content.Course;
import com.lms.models.performance.Notification;
import com.lms.models.performance.StudentCourseProgressTracker;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import lombok.Getter;

import java.util.List;

@Getter
@Entity
public class Student extends User {

    @ManyToMany(mappedBy = "students")
    private List<Course> enrolledCourses;

    @OneToMany(mappedBy = "student")
    protected List<Notification> notifications;

    @OneToMany(mappedBy = "student")
    private List<StudentCourseProgressTracker> studentCourseProgressTrackers;
}
