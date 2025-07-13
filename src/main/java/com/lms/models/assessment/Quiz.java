package com.lms.models.assessment;

import lombok.Getter;

import java.util.List;

@Getter
public class Quiz extends Assessment {

    private List<String> questions;

    private final int passingScore = 70;
}
