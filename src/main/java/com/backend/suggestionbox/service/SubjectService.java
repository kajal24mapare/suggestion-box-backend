package com.backend.suggestionbox.service;

import com.backend.suggestionbox.model.Subject;
import com.backend.suggestionbox.repository.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubjectService {

    @Autowired
    private SubjectRepository subjectRepository;

    public Subject createNewSubject(Subject newSubject) {
        Subject subject = subjectRepository.save(newSubject);
        //Business Logic

        return subject;
    }

    public List<Subject> getAllSubjects() {
        return subjectRepository.findAll();
    }
}
