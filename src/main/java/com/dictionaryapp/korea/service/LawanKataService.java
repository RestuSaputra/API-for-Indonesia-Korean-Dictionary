package com.dictionaryapp.korea.service;

import com.dictionaryapp.korea.hangeulquizmodels.LawanKata;
import com.dictionaryapp.korea.repository.LawanKataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LawanKataService {

    @Autowired
    private LawanKataRepository lawanKataRepository;

    public LawanKata createLawanKata(LawanKata lawanKata){
        return lawanKataRepository.save(lawanKata);
    }

    public List<LawanKata> getAllLawanKata(){
        return lawanKataRepository.findAll();
    }

    public LawanKata getLawanKataById(int id){
        return lawanKataRepository.findById(id).orElse(null);
    }

    public LawanKata updateLawanKata(int id, LawanKata lawanKataUpdate){
        LawanKata lawanKata = lawanKataRepository.findById(id).orElse(null);
        if (lawanKata != null){
            lawanKata.setKataDasar(lawanKataUpdate.getKataDasar());
            lawanKata.setTerjemahanDasar(lawanKataUpdate.getTerjemahanDasar());
            lawanKata.setBacaDasar(lawanKataUpdate.getBacaDasar());
            lawanKata.setKataLawan(lawanKataUpdate.getKataLawan());
            lawanKata.setTerjemahanLawan(lawanKata.getTerjemahanLawan());
            lawanKata.setBacaLawan(lawanKataUpdate.getBacaLawan());
        }
        return null;
    }

    public void deleteLawanKata(int id){
        lawanKataRepository.deleteById(id);
    }

}
