package com.dictionaryapp.korea.controllers;


import com.dictionaryapp.korea.hangeulquizmodels.Result;
import com.dictionaryapp.korea.repository.ResultRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/results")
public class ResultController {

    @Autowired
    private ResultRepository resultRepository;

    @PostMapping
    public Result saveResult(@RequestBody Result result) {
        return resultRepository.save(result);
    }

    @GetMapping("/user/{userId}")
    public List<Result> getResultsByUserId(@PathVariable Long userId) {
        return resultRepository.findByUserId(userId);
    }

    @GetMapping("/quiz/{quizId}")
    public List<Result> getResultsByQuizId(@PathVariable Long quizId) {
        return resultRepository.findByQuizId(quizId);
    }
}













