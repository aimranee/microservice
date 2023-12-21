package com.example.voiture.controller;

import com.example.voiture.entities.Voiture;
import com.example.voiture.repository.VoitureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class VoitureController {

    @Autowired
    private VoitureRepository voitureRepository;

    @GetMapping("/voitures")
    public List chercherVoitures() {
        return voitureRepository.findAll();
    }

    @GetMapping("/voiture/{id}")
    public Voiture chercherUnVoiture(@PathVariable Long id) throws Exception {

        return this.voitureRepository.findById(id).orElseThrow(() -> new Exception("Voiture inexistnt"));
    }
}
