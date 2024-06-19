package com.ucu.olimpiadas.Services;

import com.ucu.olimpiadas.Dto.ParticipantDtos;
import com.ucu.olimpiadas.Model.Participant;
import com.ucu.olimpiadas.Repository.ParticipantRepository;

import java.util.List;

public class ParticipantService {

    private final ParticipantRepository participantRepository = ParticipantRepository.getInstance();

    private static ParticipantService instance = null;

    private ParticipantService() {}

    public static ParticipantService getInstance() {
        if (instance == null) {
            instance = new ParticipantService();
        }
        return instance;
    }

    public void addParticipant(ParticipantDtos.genericParticipanteDto participant) {
        participantRepository.addParticipant(new Participant(participant.name(), participant.address(), participant.ci()));
    }

    public void deleteParticipant(int ci) {
        participantRepository.removeParticipant(ci);
    }

    public void updateParticipant(ParticipantDtos.genericParticipanteDto participant) {
        Participant p = participantRepository.getParticipantByCi(participant.ci());
        p.setName(participant.name());
        p.setAddress(participant.address());
    }

    public List<Participant> getParticipants() {
        return participantRepository.getParticipants();
    }

    public Participant getParticipantByCi(int ci) {
        return participantRepository.getParticipantByCi(ci);
    }
}
