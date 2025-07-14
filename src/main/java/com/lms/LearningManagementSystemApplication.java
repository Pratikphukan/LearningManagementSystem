package com.lms;

import com.lms.controllers.InstructorController;
import com.lms.controllers.UserController;
import com.lms.dtos.CreateCourseRequestDto;
import com.lms.dtos.CreateUserRequestDto;
import com.lms.dtos.CreateUserResponseDto;
import com.lms.models.UserType;
import com.lms.observers.CourseEventsObserver;
import com.lms.observers.EmailCourseEventsObserver;
import com.lms.observers.SMSCourseEventsObserver;
import com.lms.services.CourseEventsNotifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LearningManagementSystemApplication {

    public static void main(String[] args) {


        SpringApplication.run(LearningManagementSystemApplication.class, args);

        CourseEventsNotifier courseEventsNotifier = CourseEventsNotifier.getInstance();

        EmailCourseEventsObserver emailCourseEventsObserver = EmailCourseEventsObserver.getInstance();
        SMSCourseEventsObserver smsCourseEventsObserver = SMSCourseEventsObserver.getInstance();

        courseEventsNotifier.notifyObservers();

        UserController instructorController = UserController.getInstance();
        CreateUserRequestDto instructorRequest = new CreateUserRequestDto();
        instructorRequest.setName("John Doe");
        instructorRequest.setEmail("john.doe@example.com");
        instructorRequest.setPassword("wertyui");
        instructorRequest.setUserType(UserType.INSTRUCTOR);
        instructorController.createUser(instructorRequest); // Placeholder for actual request object
    }

}
