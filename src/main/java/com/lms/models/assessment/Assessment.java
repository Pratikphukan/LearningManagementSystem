package com.lms.models.assessment;

import com.lms.models.BaseModel;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@MappedSuperclass
public abstract class Assessment extends BaseModel {

    protected String title;

    protected Module module;

    protected LocalDateTime dueDate;
}
