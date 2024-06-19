package com.ucu.olimpiadas.Controller;

import java.util.List;


import com.ucu.olimpiadas.Repository.DisciplineRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/discipline")
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
