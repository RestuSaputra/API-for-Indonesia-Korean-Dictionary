package com.dictionaryapp.korea.repository;

import com.dictionaryapp.korea.hangeulquizmodels.LawanKata;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LawanKataRepository extends JpaRepository<LawanKata, Integer> {
    List<LawanKata> findAll();
}
