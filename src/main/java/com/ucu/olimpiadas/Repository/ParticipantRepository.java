package com.ucu.olimpiadas.Repository;
import com.ucu.olimpiadas.Model.Person.Participant;
import java.util.ArrayList;
import java.util.List;

public class ParticipantRepository {

    private static ParticipantRepository instance = null;
    private final List<Participant> participants;

    private ParticipantRepository() {
        participants = new ArrayList<>();
    }

    public static ParticipantRepository getInstance() {
        if (instance == null) {
            instance = new ParticipantRepository();
        }
        return instance;
    }

    public void addParticipant(Participant participant) {
        participants.add(participant);
    }

    public void removeParticipant(int id) {
        participants.remove(id);
    }

    public List<Participant> getParticipants() {
        return participants;
    }

    public Participant getParticipantByCi(Integer ci) {
        for (Participant participant : participants) {
            if (participant.getCI() == ci) {
                return participant;
            }
        }
        return null;
    }
}
