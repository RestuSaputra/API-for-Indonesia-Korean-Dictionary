package com.dictionaryapp.korea.controllers;

import com.dictionaryapp.korea.hangeulquizmodels.Question;
import com.dictionaryapp.korea.hangeulquizmodels.Quiz;
import com.dictionaryapp.korea.hangeulquizmodels.Result;
import com.dictionaryapp.korea.repository.QuestionRepository;
import com.dictionaryapp.korea.repository.QuizRepository;
import com.dictionaryapp.korea.repository.ResultRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/quizzes")
public class QuizController {
    @Autowired
    private QuizRepository quizRepository;
    @Autowired
    private QuestionRepository questionRepository;
    @Autowired
    private ResultRepository resultRepository;

    @GetMapping
    public List<Quiz> getAllQuizzes() {
        return quizRepository.findAll();
    }

    @GetMapping("/{quizId}/question")
    public List<Question> getQuestionsByQuizId(@PathVariable Long quizId) {
        return questionRepository.findByQuizId(quizId);
    }

    @PostMapping("/results")
    public Result saveResult(@RequestBody Result result) {
        return resultRepository.save(result);
    }
}
