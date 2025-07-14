package com.lms.repositories;

import com.lms.models.users.Instructor;

import java.util.HashMap;
import java.util.Map;

public class InstructorRepository {

    private static InstructorRepository instance;
    private static Long lastCounnt = 0L;
    private Map<Long, Instructor> instructorStore = new HashMap<>();

    private InstructorRepository() {
        // Private constructor to prevent instantiation
    }

    public static InstructorRepository getInstance() {
        if (instance == null) {
            instance = new InstructorRepository();
        }
        return instance;
    }

    public Instructor saveInstructor(Instructor instructor) {
        lastCounnt++;
        instructor.setId(lastCounnt);
        instructorStore.put(lastCounnt, instructor);
        return instructor;
    }
}
