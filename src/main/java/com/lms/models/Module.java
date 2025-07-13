package com.lms.models;

import com.lms.models.content.Course;
import lombok.Getter;

import java.util.List;

@Getter
public class Module extends BaseModel {

    private String title;

    private String content;

    private Course course;

    private List<Assessment> assessments;
}
