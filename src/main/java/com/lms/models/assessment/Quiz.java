package com.lms.models.assessment;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Quiz extends Assessment {

    private final int passingScore = 70;

    @OneToMany(mappedBy = "quiz")
    private List<Question> questions;
}
