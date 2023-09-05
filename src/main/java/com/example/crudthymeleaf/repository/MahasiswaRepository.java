package com.example.crudthymeleaf.repository;

import com.example.crudthymeleaf.entity.Mahasiswa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MahasiswaRepository extends JpaRepository<Mahasiswa, Long> {
}
