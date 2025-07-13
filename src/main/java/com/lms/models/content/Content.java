package com.lms.models.content;

import com.lms.models.BaseModel;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@MappedSuperclass
public abstract class Content extends BaseModel {

    protected String title;

    protected String description;

}
