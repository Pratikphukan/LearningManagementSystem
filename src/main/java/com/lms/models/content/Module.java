package com.lms.models.content;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;

@Getter
@Entity
public class Module extends Content {

    @ManyToOne
    private Course course;
}
