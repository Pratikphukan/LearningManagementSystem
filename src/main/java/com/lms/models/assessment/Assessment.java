package com.lms.models.assessment;

import com.lms.models.BaseModel;
import com.lms.models.content.Module;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@MappedSuperclass
public abstract class Assessment extends BaseModel {

    protected String title;

    @ManyToOne
    @JoinColumn(name = "module_id")
    protected Module module;

    protected LocalDateTime dueDate;
}
