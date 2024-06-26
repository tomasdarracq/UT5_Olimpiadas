package com.ucu.olimpiadas.Controller;

import com.ucu.olimpiadas.Dto.ParticipantDtos;
import com.ucu.olimpiadas.Model.Person.Participant;

import com.ucu.olimpiadas.Service.ParticipantService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(path = "/api/participant")
public class ParticipantController {
    private final ParticipantService service = ParticipantService.getInstance();

    @GetMapping(path = "")
    public ResponseEntity<?> getParticipant(@RequestParam int ci) {
        Participant participant = service.getParticipantByCi(ci);
        return ResponseEntity.ok(participant);
    }

    @PutMapping(path = "/update")
    public ResponseEntity<?> updateParticipant(@RequestBody ParticipantDtos.genericParticipanteDto participant) {
        service.updateParticipant(participant);
        return ResponseEntity.ok("Participant updated successfully");
    }

    @DeleteMapping(path = "/delete")
    public ResponseEntity<?> deleteParticipant(@RequestParam int id) {
        service.deleteParticipant(id);
        return ResponseEntity.ok("Participant deleted successfully");
    }

    @PostMapping("/")
    public ResponseEntity<?> addParticipant(@RequestBody ParticipantDtos.genericParticipanteDto participant) {
        service.addParticipant(participant);
        return ResponseEntity.ok("Participant added successfully");
    }

    @GetMapping("/")
    public ResponseEntity<?> getParticipants() {
        return ResponseEntity.ok(service.getParticipants());
    }
}
