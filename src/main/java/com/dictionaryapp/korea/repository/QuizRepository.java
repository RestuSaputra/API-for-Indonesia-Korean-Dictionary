package com.dictionaryapp.korea.repository;

import com.dictionaryapp.korea.hangeulquizmodels.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuizRepository extends JpaRepository<Quiz, Long> {}
