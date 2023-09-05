package com.example.crudthymeleaf;

import com.example.crudthymeleaf.entity.Mahasiswa;
import com.example.crudthymeleaf.repository.MahasiswaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CrudthymeleafApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(CrudthymeleafApplication.class, args);
    }

    @Autowired
    private MahasiswaRepository mahasiswaRepository;
    @Override
    public void run(String... args) throws Exception {
//        Mahasiswa mhs1 = new Mahasiswa("Wahyu", "Jebred'z", "Kota Banjar");
//        mahasiswaRepository.save(mhs1);
//        Mahasiswa mhs2 = new Mahasiswa("Dede", "Adam", "Kabupaten Ciamis");
//        mahasiswaRepository.save(mhs2);
//        Mahasiswa mhs3 = new Mahasiswa("Tigana", "Reymansyah", "Kota Sibolga");
//        mahasiswaRepository.save(mhs3);

    }
}
