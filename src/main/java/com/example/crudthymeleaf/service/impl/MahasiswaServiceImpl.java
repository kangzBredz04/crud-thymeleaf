package com.example.crudthymeleaf.service.impl;

import com.example.crudthymeleaf.entity.Mahasiswa;
import com.example.crudthymeleaf.repository.MahasiswaRepository;
import com.example.crudthymeleaf.service.MahasiswaService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MahasiswaServiceImpl implements MahasiswaService {
    private MahasiswaRepository mahasiswaRepository;

    public MahasiswaServiceImpl(MahasiswaRepository mahasiswaRepository) {
        super();
        this.mahasiswaRepository = mahasiswaRepository;
    }

    @Override
    public List<Mahasiswa> getAllMahasiswa() {
        return mahasiswaRepository.findAll();
    }

    @Override
    public Mahasiswa saveMahasiswa(Mahasiswa mahasiswa) {
        return mahasiswaRepository.save(mahasiswa);
    }

    @Override
    public Mahasiswa getDataMahasiswaById(Long id) {
        return mahasiswaRepository.findById(id).get();
    }

    @Override
    public Mahasiswa updateMahasiswa(Mahasiswa mahasiswa) {
        return mahasiswaRepository.save(mahasiswa);
    }

    @Override
    public void deleteMahasiswaById(Long id) {
        mahasiswaRepository.deleteById(id);
    }
}
