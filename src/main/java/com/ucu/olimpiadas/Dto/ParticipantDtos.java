package com.ucu.olimpiadas.Dto;

public class ParticipantDtos {
    public record genericParticipanteDto(
            String name,
            String address,
            Integer ci
    ){}
}
