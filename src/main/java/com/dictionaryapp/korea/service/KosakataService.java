package com.dictionaryapp.korea.service;


import com.dictionaryapp.korea.kosakatamodels.Kosakata;
import com.dictionaryapp.korea.repository.KosakataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class KosakataService {

    @Autowired
    private KosakataRepository kosakataRepository;


    public Kosakata createKosakata(Kosakata kosakata){
        return kosakataRepository.save(kosakata);
    }

    public List<Kosakata> getAllKosakata(){
        return kosakataRepository.findAll();
    }

    public Kosakata getKosakataById(int id){
        return kosakataRepository.findById(id).orElse(null);
    }

    public Kosakata updateKosakata(int id, Kosakata kosakataDetail){
        Kosakata kosakata = kosakataRepository.findById(id).orElse(null);
        if (kosakata != null){
            kosakata.setKata(kosakataDetail.getKata());
            kosakata.setTerjemahan(kosakataDetail.getTerjemahan());
            kosakata.setCarabaca(kosakataDetail.getCarabaca());
            kosakata.setKeterangan(kosakataDetail.getKeterangan());
            return kosakataRepository.save(kosakata);
        }
        return null;
    }

    public void deleteKosakata(int id){
        kosakataRepository.deleteById(id);
    }

    public List<Kosakata> searchKosakata(String kata){
        List <Kosakata> kosakatas = kosakataRepository.findAll();
        BoyerMoore bm = new BoyerMoore(kata);
        return kosakatas.stream()
                .filter(kosakata -> bm.search(kosakata.getKata()) != kosakata.getKata().length())
                .collect(Collectors.toList());
    }
}





























