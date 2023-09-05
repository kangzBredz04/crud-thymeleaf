package com.example.crudthymeleaf.service;

import com.example.crudthymeleaf.entity.Mahasiswa;

import java.util.List;

public interface MahasiswaService {
    List<Mahasiswa> getAllMahasiswa();
    Mahasiswa saveMahasiswa(Mahasiswa mahasiswa);
    Mahasiswa getDataMahasiswaById(Long id);
    Mahasiswa updateMahasiswa(Mahasiswa mahasiswa);
    void deleteMahasiswaById(Long id);
}
