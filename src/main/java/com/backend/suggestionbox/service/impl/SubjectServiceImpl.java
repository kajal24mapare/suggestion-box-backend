package com.backend.suggestionbox.service.impl;

import com.backend.suggestionbox.entities.Subject;
import com.backend.suggestionbox.repository.SubjectRepository;
import com.backend.suggestionbox.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubjectServiceImpl implements SubjectService {

    private SubjectRepository subjectRepository;

    @Autowired
    public SubjectServiceImpl(SubjectRepository subjectRepository) {
        this.subjectRepository = subjectRepository;
    }

    @Override
    public Subject createNewSubject(Subject newSubject) {
        return this.subjectRepository.save(newSubject);
    }

    @Override
    public List<Subject> getAllSubjects() {
        return this.subjectRepository.findAll();
    }

    @Override
    public Subject getSubject(Long subjectId) {
        return this.subjectRepository.findById(subjectId).orElseThrow(()->new RuntimeException("Subject you are looking for cannot be found on server!"));
    }
}
