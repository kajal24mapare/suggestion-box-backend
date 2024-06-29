package com.backend.suggestionbox.repository;

import com.backend.suggestionbox.model.Subject;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubjectRepository extends JpaRepository<Subject, Long> {
}
