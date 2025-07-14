package com.lms.factory;

import com.lms.services.InstructorService;
import com.lms.services.StudentService;
import com.lms.services.UserService;

public class UserServiceFactory {

    public static UserService getUserService(String userType) {
        if (userType == null || userType.isEmpty()) {
            return null;
        }
        return switch (userType.toLowerCase()) {
            case "student" -> StudentService.getInstance();
            case "instructor" -> InstructorService.getInstance();
            default -> throw new IllegalArgumentException("Unknown user type: " + userType);
        };
    }
}
