package com.lms.dtos;

import lombok.Getter;

@Getter
public enum ResponseStatus {

    SUCCESS("Success"),
    FAILURE("Failure"),
    ERROR("Error");

    private final String responseStatus;

    ResponseStatus(String responseStatus) {
        this.responseStatus = responseStatus;
    }
}
