package com.lms.models.content;

import com.lms.models.assessment.Assignment;
import com.lms.models.assessment.Quiz;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Module extends Content {

    @ManyToOne
    private Course course;

    @OneToMany(mappedBy = "module")
    private List<Quiz> quizzes;

    @OneToMany(mappedBy = "module")
    private List<Assignment> assignments;
}
