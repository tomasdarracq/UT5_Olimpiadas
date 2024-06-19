package com.ucu.olimpiadas.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.ucu.olimpiadas.Repository.DisciplineRepository;

public class DisciplineController {

    private DisciplineRepository disciplineRepository = DisciplineRepository.getInstance();


    @PostMapping("/addDiscipline")
    public void addDiscipline(String discipline) {
        disciplineRepository.addDiscipline(discipline);
    }

    @GetMapping("/getDisciplines")
    public List<String> getDisciplines() {
        return disciplineRepository.getDisciplines();
    }
}
