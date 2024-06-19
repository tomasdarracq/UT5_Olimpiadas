package com.ucu.olimpiadas.Controller;

import com.ucu.olimpiadas.Model.Participant;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping(path = "/api/participant")
public class ParticipantController {

    @GetMapping(path = "/getAllParticipants")
    public List<Participant> getAllParticipants() {
        return null;
    }

    @GetMapping(path = "/getParticipant")
    public Participant getParticipant(@RequestParam int id) {
        return null;
    }

    @PostMapping(path = "/addParticipant")
    public Participant addParticipant(@RequestBody Participant participant) {
        return participant;
    }

    @PutMapping(path = "/updateParticipant")
    public Participant updateParticipant(@RequestBody Participant participant) {
        return participant;
    }

    @DeleteMapping(path = "/deleteParticipant")
    public void deleteParticipant(@RequestParam int id) {

    }
}
