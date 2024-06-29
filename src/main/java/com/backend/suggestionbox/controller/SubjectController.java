package com.backend.suggestionbox.controller;

import com.backend.suggestionbox.model.Subject;
import com.backend.suggestionbox.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class SubjectController {

    @Autowired
    private SubjectService subjectService;

    @PostMapping("/createSubject")
    Subject newSubject(@RequestBody Subject newSubject) {
        return subjectService.createNewSubject(newSubject);
    }

    @GetMapping("/subjects")
    List<Subject> getSubjects() {
        return subjectService.getAllSubjects();
    }

}
