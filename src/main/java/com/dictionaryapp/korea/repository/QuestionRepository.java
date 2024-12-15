package com.dictionaryapp.korea.repository;

import com.dictionaryapp.korea.hangeulquizmodels.Question;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface QuestionRepository extends JpaRepository<Question, Long> {
    List<Question> findByQuizId(Long id);
}
