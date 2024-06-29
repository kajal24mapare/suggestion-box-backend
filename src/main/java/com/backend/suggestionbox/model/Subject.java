package com.backend.suggestionbox.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.io.Serializable;

@Entity
@Table(name = "subject")
@Data // replacement for getter setter
public class Subject implements Serializable {

    @Id
    @GeneratedValue
    private Long subjectId;

    private String title;

    private String description;

    private Integer responseCount;

}
