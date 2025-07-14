package com.lms.controllers;

import com.lms.dtos.CreateCourseRequestDto;
import com.lms.dtos.CreateCourseResponseDto;
import com.lms.dtos.ResponseDto;
import com.lms.dtos.ResponseStatus;
import com.lms.models.content.Course;
import com.lms.services.InstructorService;

public class InstructorController {

    private static InstructorController instance;
    private InstructorService instructorService;

    private InstructorController() {
        this.instructorService = InstructorService.getInstance();
    }

    public static InstructorController getInstance() {
        if (instance == null) {
            instance = new InstructorController();
        }
        return instance;
    }

    public ResponseDto<CreateCourseResponseDto> createCourse(CreateCourseRequestDto request) {
        // Logic to create a course
        // This is a placeholder implementation
        //Course course = instructorService.createCourse(request.getTitle(), request.getDescription(), request.getInstructorId());
        CreateCourseResponseDto response = new CreateCourseResponseDto();
        return new ResponseDto<>("Success", response, ResponseStatus.SUCCESS);
    }

}
