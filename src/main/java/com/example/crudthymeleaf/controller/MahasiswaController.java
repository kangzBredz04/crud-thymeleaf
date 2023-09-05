package com.example.crudthymeleaf.controller;

import com.example.crudthymeleaf.entity.Mahasiswa;
import com.example.crudthymeleaf.service.MahasiswaService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MahasiswaController {
    private MahasiswaService mahasiswaService;

    public MahasiswaController(MahasiswaService mahasiswaService) {
        super();
        this.mahasiswaService = mahasiswaService;
    }
    // GET DATA MAHASISWA
    @GetMapping("/mahasiswa")
    public String listMahasiswa(Model model){
        model.addAttribute("mahasiswa", mahasiswaService.getAllMahasiswa());
        return "mahasiswa";
    }

    // REDIRECT KE TAMBAH DATA MAHASISWA
    @GetMapping("/mahasiswa/new")
    public String tambahMahasiswa(Model model){
        Mahasiswa mahasiswa = new Mahasiswa();
        model.addAttribute("mahasiswa", mahasiswa);
        return "tambah_mahasiswa";
    }

    // SIMPAN TAMBAH DATA MAHASISWA
    @PostMapping("/mahasiswa")
    public String simpanMahasiswa(@ModelAttribute("mahasiswa") Mahasiswa mahasiswa){
        mahasiswaService.saveMahasiswa(mahasiswa);
        // Redirect ke halaman awal
        return "redirect:/mahasiswa";
    }

    // REDIRECT KE EDIT DATA MAHASISWA
    @GetMapping("/mahasiswa/edit/{id}")
    public String editMahasiswa(@PathVariable Long id, Model model){
        model.addAttribute("mahasiswa", mahasiswaService.getDataMahasiswaById(id));
        return "edit_mahasiswa";
    }

    // EDIT ATAU UPDATE DATA MAHASISWA
    @PostMapping("/mahasiswa/{id}")
    public String updateMahasiswa(@PathVariable Long id, @ModelAttribute("mahasiswa") Mahasiswa mahasiswa, Model model){
        // GET DATA MAHASISWA DARI DATABASE
        Mahasiswa dataMahasiswa = mahasiswaService.getDataMahasiswaById(id);
        dataMahasiswa.setId(id);
        dataMahasiswa.setNamaDepan(mahasiswa.getNamaDepan());
        dataMahasiswa.setNamaBelakang(mahasiswa.getNamaBelakang());
        dataMahasiswa.setAsalDaerah(mahasiswa.getAsalDaerah());

        // SAVE UPDATE DATA MAHASISWA
        mahasiswaService.updateMahasiswa(dataMahasiswa);
        return "redirect:/mahasiswa";
    }

    // DELETE DATA MAHASISWA
    @GetMapping("/mahasiswa/{id}")
    public String deleteMahasiswa(@PathVariable Long id){
        mahasiswaService.deleteMahasiswaById(id);
        return "redirect:/mahasiswa";
    }
}
