package com.dictionaryapp.korea.service;

import com.dictionaryapp.korea.hangeulquizmodels.Hangeul;
import com.dictionaryapp.korea.repository.HangeulRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HangeulService {

    @Autowired
    HangeulRepository hangeulRepository;

    public List<Hangeul> getAllHangeul(){
        return hangeulRepository.findAll();
    }

    public List<Hangeul> getHangeulByKeterangan(String keterangan){
        return hangeulRepository.findByKeterangan(keterangan);
    }

    public Hangeul getHangeulById(int id){
        return hangeulRepository.findById(id).orElse(null);
    }

//    public List<Hangeul> getKonsonanTunggal(String konsonanTunggal){
//        return  hangeulRepository.findKonsonanTunggal(konsonanTunggal);
//    }
//
//    public List<Hangeul> getVokalTunggal(String vokalTunggal){
//        return hangeulRepository.findVokalTunggal(vokalTunggal);
//    }
//
//    public List<Hangeul> getKonsonanGanda(String konsonanGanda){
//        return hangeulRepository.findKonsonanGanda(konsonanGanda);
//    }
//
//    public List<Hangeul> getVokalGanda(String vokalGanda){
//        return hangeulRepository.findVokalGanda(vokalGanda);
//    }

}






















