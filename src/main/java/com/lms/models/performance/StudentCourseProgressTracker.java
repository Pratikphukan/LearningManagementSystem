package com.lms.models.performance;

import com.lms.models.BaseModel;
import com.lms.models.content.Course;
import com.lms.models.users.Student;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class StudentCourseProgressTracker extends BaseModel {

    @ManyToOne
    private Student student;

    @ManyToOne
    private Course course;

    @Enumerated(EnumType.STRING)
    private Progress progress;
}
