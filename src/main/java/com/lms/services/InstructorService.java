package com.lms.services;

import com.lms.dtos.CreateUserRequestDto;
import com.lms.models.content.Course;
import com.lms.models.users.Instructor;
import com.lms.models.users.User;
import com.lms.repositories.CourseRepository;
import com.lms.repositories.InstructorRepository;

import java.time.LocalDateTime;

public class InstructorService implements UserService {

    private static InstructorService instance;
    private CourseRepository courseRepository;
    private InstructorRepository instructorRepository;

    private InstructorService() {
        this.courseRepository = CourseRepository.getInstance();
        this.instructorRepository = InstructorRepository.getInstance();
    }

    public static InstructorService getInstance() {
        if (instance == null) {
            instance = new InstructorService();
        }
        return instance;
    }

    public Course createCourse(String title, String description, Long instructorId) {
        return null;
    }

    @Override
    public User createUser(CreateUserRequestDto createUserRequestDto) {
        Instructor instructor = new Instructor();
        instructor.setName(createUserRequestDto.getName());
        instructor.setEmail(createUserRequestDto.getEmail());
        instructor.setPassword(createUserRequestDto.getPassword());
        instructor.setCreatedDate(LocalDateTime.now());
        instructor.setLastUpdatedDate(LocalDateTime.now());
        instructorRepository.saveInstructor(instructor);
        return instructor;
    }
}
