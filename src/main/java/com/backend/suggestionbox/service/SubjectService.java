package com.backend.suggestionbox.service;

import com.backend.suggestionbox.entities.Subject;

import java.util.List;

public interface SubjectService {

    // create subject
     Subject createNewSubject(Subject newSubject);

     // getAll subjects
     List<Subject> getAllSubjects() ;

     // get single subject
     Subject getSubject(Long subjectId);
}
