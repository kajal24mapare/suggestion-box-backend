package com.backend.suggestionbox.controller;

import com.backend.suggestionbox.entities.Subject;
import com.backend.suggestionbox.service.SubjectService;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@Controller
public class SubjectController {

    @Autowired
    private SubjectService subjectService;

    // create subject
    @MutationMapping("createNewSubject")
    public Subject createNewSubject(@Argument SubjectInput newSubject) {
        Subject subject = new Subject();
        subject.setTitle(newSubject.getTitle());
        subject.setDescription(newSubject.getDescription());
        subject.setResponseCount(newSubject.getResponseCount());
        return this.subjectService.createNewSubject(subject);
    }

    // get all subjects
    @QueryMapping("getAllSubjects")
    public List<Subject> getAllSubjects() {
        return this.subjectService.getAllSubjects();
    }

    // get specific subject
    @QueryMapping("getSubject")
    public Subject getSubject(@Argument Long subjectId) {
        return this.subjectService.getSubject(subjectId);
    }

}

@Getter
@Setter
class SubjectInput {
    private String title;

    private String description;

    private Integer responseCount;
}
