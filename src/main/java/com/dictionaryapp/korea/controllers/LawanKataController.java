package com.dictionaryapp.korea.controllers;

import com.dictionaryapp.korea.hangeulquizmodels.LawanKata;
import com.dictionaryapp.korea.service.LawanKataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/antonim")
public class LawanKataController {

    @Autowired
    private LawanKataService lawanKataService;

    @PostMapping
    public LawanKata createLawanKata(@RequestBody LawanKata lawanKata){
        return lawanKataService.createLawanKata(lawanKata);
    }

    @GetMapping
    public List<LawanKata> getAllLawanKata(){
        return lawanKataService.getAllLawanKata();
    }

    @GetMapping("/{id}")
    public ResponseEntity<LawanKata> getLawanKataById(@PathVariable int id){
        LawanKata lawanKata = lawanKataService.getLawanKataById(id);
        if (lawanKata != null){
            return  ResponseEntity.ok(lawanKata);
        }
        return ResponseEntity.notFound().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<LawanKata> updateLawanKata(@PathVariable int id, @RequestBody LawanKata lawanKata){
        LawanKata updateLawanKata = lawanKataService.updateLawanKata(id, lawanKata);
        if (updateLawanKata != null){
            return ResponseEntity.ok(updateLawanKata);
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteLawanKata(@PathVariable int id){
        lawanKataService.deleteLawanKata(id);
        return ResponseEntity.noContent().build();
    }

}
