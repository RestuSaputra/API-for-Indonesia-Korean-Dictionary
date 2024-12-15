package com.dictionaryapp.korea.controllers;


import com.dictionaryapp.korea.kosakatamodels.Kosakata;
import com.dictionaryapp.korea.service.KosakataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/kata")
public class KosakataController {

    @Autowired
    private KosakataService kosakataService;

    @PostMapping
    public Kosakata createKosakata(@RequestBody Kosakata kosakata){
        return kosakataService.createKosakata(kosakata);
    }

    @GetMapping
    public List<Kosakata> getAllKosakata(){
        return kosakataService.getAllKosakata();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Kosakata> getKosakataById(@PathVariable int id){
        Kosakata kosakata = kosakataService.getKosakataById(id);
        if (kosakata != null){
            return ResponseEntity.ok(kosakata);
        }
        return ResponseEntity.notFound().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Kosakata> updateKosakata(@PathVariable int id, @RequestBody Kosakata kosakataDetail){
        Kosakata updateKosakata = kosakataService.updateKosakata(id, kosakataDetail);
        if (updateKosakata != null) {
            return ResponseEntity.ok(updateKosakata);
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteKosakata(@PathVariable int id){
        kosakataService.deleteKosakata(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/search")
    public List<Kosakata> searchKosakata(@RequestParam String kata){
        return kosakataService.searchKosakata(kata);
    }

}
























