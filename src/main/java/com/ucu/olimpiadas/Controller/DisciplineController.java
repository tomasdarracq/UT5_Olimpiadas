package com.ucu.olimpiadas.Controller;

import java.util.List;


import com.ucu.olimpiadas.Dto.DisciplineDtos;
import com.ucu.olimpiadas.Service.DisciplineService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api/discipline")
public class DisciplineController {

    private final DisciplineService disciplineService = DisciplineService.getInstance();

    @PostMapping("")
    public ResponseEntity<?> addDiscipline(@RequestBody DisciplineDtos.genericDisciplineDto discipline) {
        disciplineService.addDiscipline(discipline);
        return ResponseEntity.ok("Discipline added successfully");
    }

    @GetMapping("")
    public ResponseEntity<?> getDisciplines() {
        List<?> disciplines = disciplineService.getDisciplines();
        return ResponseEntity.ok(disciplines);
    }

    @GetMapping("/getByNameAndParticipant")
    public ResponseEntity<?> getDisciplineByNameAndParticipant(@RequestParam String name, @RequestParam int participant) {
        return ResponseEntity.ok(disciplineService.getDisciplineByNameAndParticipant(name, participant));
    }
}
