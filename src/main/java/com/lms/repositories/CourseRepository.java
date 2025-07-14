package com.lms.repositories;

import com.lms.models.content.Course;

import java.util.HashMap;
import java.util.Map;

public class CourseRepository {

    private static CourseRepository instance;
    private static Long lastCounnt = 0L;
    private Map<Long, Course> courseStore = new HashMap<>();

    private CourseRepository() {
        // private constructor to prevent instantiation
    }

    public static CourseRepository getInstance() {
        if (instance == null) {
            instance = new CourseRepository();
        }
        return instance;
    }

    public Course saveCourse(Course course) {
        return null;
    }
}
