package com.lms.models.assessment;

import com.lms.models.BaseModel;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Submission extends BaseModel {

    private String submissionText;

    @ManyToOne
    @JoinColumn(name = "assignment_id")
    private Assignment assignment;
}
