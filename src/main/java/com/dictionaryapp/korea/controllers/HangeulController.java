package com.dictionaryapp.korea.controllers;

import com.dictionaryapp.korea.hangeulquizmodels.Hangeul;
import com.dictionaryapp.korea.service.HangeulService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/hangeul")
public class HangeulController {

    @Autowired
    private HangeulService hangeulService;

    @GetMapping
    public List<Hangeul> getAllHangeul(){
        return hangeulService.getAllHangeul();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Hangeul> getHangeulById(@PathVariable int id){
        Hangeul hangeul = hangeulService.getHangeulById(id);
        if (hangeul != null){
            return ResponseEntity.ok(hangeul);
        }
        return ResponseEntity.notFound().build();
    }

    @GetMapping("/konsonantunggal")
    public List<Hangeul> getHangeulKonsonanTunggal(){
        String keterangan = "konsonan_tunggal";
        return hangeulService.getHangeulByKeterangan(keterangan);
    }

    @GetMapping("/vokaltunggal")
    public List<Hangeul> getHangeulVokalTunggal(){
        String keterangan = "vokal_tunggal";
        return hangeulService.getHangeulByKeterangan(keterangan);
    }

    @GetMapping("/konsonanganda")
    public List<Hangeul> getHangeulKonsonanGanda(){
        String keterangan = "konsonan_ganda";
        return hangeulService.getHangeulByKeterangan(keterangan);
    }

    @GetMapping("/vokalganda")
    public List<Hangeul> getHangeulVokalGanda(){
        String keterangan = "vokal_ganda";
        return hangeulService.getHangeulByKeterangan(keterangan);
    }

//    @GetMapping("/konsonanTunggal")
//    public List<Hangeul> getHangeulByKonsonanTunggal(@RequestParam String konsonanTunggal){
//        return hangeulService.getKonsonanTunggal(konsonanTunggal);
//    }
//
//    @GetMapping("/vokalTunggal")
//    public List<Hangeul> getHangeulByVokalTunggal(@RequestParam String vokalTunggal){
//        return hangeulService.getVokalTunggal(vokalTunggal);
//    }
//
//    @GetMapping("/konsonanGanda")
//    public List<Hangeul> getHangeulByKonsonanGanda(@RequestParam String konsonanGanda){
//        return hangeulService.getKonsonanGanda(konsonanGanda);
//    }
//
//    @GetMapping("/vokalGanda")
//    public  List<Hangeul> getHangeulByVokalGanda(@RequestParam String vokalGanda){
//        return hangeulService.getVokalGanda(vokalGanda);
//    }

}





























