package com.ucu.olimpiadas.Repository;

import com.ucu.olimpiadas.Model.*;
import java.util.ArrayList;
import java.util.List;

public class ParticipantRepository {

    private static ParticipantRepository instance = null;
    private List<Participant> participants;

    private ParticipantRepository() {
        participants = new ArrayList<>();
    }

    public static synchronized ParticipantRepository getInstance() {
        if (instance == null) {
            instance = new ParticipantRepository();
        }
        return instance;
    }

    public void addParticipant(Participant participant) {
        participants.add(participant);
    }

    public List<Participant> getParticipants() {
        return participants;
    }
}
