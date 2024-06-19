package com.ucu.olimpiadas.Controller;

import com.ucu.olimpiadas.Model.Participant;
import com.ucu.olimpiadas.Repository.ParticipantRepository;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping(path = "/api/participant")
public class ParticipantController {

        private ParticipantRepository repository = ParticipantRepository.getInstance();

    @GetMapping(path = "/getParticipant")
    public Participant getParticipant(@RequestParam int id) {
        return null;
    }

    @PutMapping(path = "/updateParticipant")
    public Participant updateParticipant(@RequestBody Participant participant) {
        return participant;
    }

    @DeleteMapping(path = "/deleteParticipant")
    public void deleteParticipant(@RequestParam int id) {

    }

    @PostMapping("/")
    public void addParticipant(@RequestBody Participant participant) {
        repository.addParticipant(participant);
    }

    @GetMapping("/")
    public List<Participant> getParticipants() {
        return repository.getParticipants();
    }
}
