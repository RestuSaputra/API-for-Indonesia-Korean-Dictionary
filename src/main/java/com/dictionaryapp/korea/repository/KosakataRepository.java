package com.dictionaryapp.korea.repository;

import com.dictionaryapp.korea.kosakatamodels.Kosakata;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface KosakataRepository extends JpaRepository<Kosakata, Integer> {
    List<Kosakata> findAll();
}
