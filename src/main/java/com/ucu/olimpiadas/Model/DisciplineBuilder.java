package com.ucu.olimpiadas.Model;

public interface DisciplineBuilder {
    DisciplineBuilder setName(String name);
    DisciplineBuilder setAthlete(Participant athlete);
    IDiscipline build();
}