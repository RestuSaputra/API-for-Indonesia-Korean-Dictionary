package com.dictionaryapp.korea.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dictionaryapp.korea.hangeulquizmodels.Hangeul;

public interface HangeulRepository extends JpaRepository<Hangeul, Integer> {

    List<Hangeul> findAll();

    List<Hangeul> findByKeterangan(String keterangan);

//    @Query("select i from Hangeul i where i.keterangan = :konsonanTunggal")
//    List<Hangeul> findKonsonanTunggal(@Param("konsonanTunggal") String konsonanTunggal);

//    @Query("select i from Hangeul i where i.keterangan = :vokalTunggal")
//    List<Hangeul> findVokalTunggal(@Param("vokalTunggal") String vokalTunggal);

//    @Query("select i from Hangeul i where i.keterangan = :konsonanGanda")
//    List<Hangeul> findKonsonanGanda(@Param("konsonanGanda") String konsonanGanda);

//    @Query("select i from Hangeul i where i.keterangan = :vokalGanda")
//    List<Hangeul> findVokalGanda(@Param("vokalGanda") String vokalGanda);
}
