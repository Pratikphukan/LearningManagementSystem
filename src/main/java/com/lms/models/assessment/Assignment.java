package com.lms.models.assessment;

import lombok.Getter;

import java.util.List;

@Getter
public class Assignment extends Assessment {

    private int maxScore;

    private List<String> submissions;
}
