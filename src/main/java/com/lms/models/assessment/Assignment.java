package com.lms.models.assessment;

import com.lms.models.content.Module;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Assignment extends Assessment {

    private int maxScore;

    @OneToMany(mappedBy = "assignment")
    private List<Submission> submissions;
}
