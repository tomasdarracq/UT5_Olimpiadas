package com.ucu.olimpiadas.Model;

public interface DisciplineBuilder {
    DisciplineBuilder setName(String name);
    DisciplineBuilder setCategory(String category);
    DisciplineBuilder setAthlete(Participant athlete);
    IDiscipline build();
}