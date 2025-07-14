package com.lms.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateCourseRequestDto {

    private String title;

    private String description;

    private Long instructorId;
}
