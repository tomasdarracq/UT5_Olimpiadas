package com.ucu.olimpiadas.Model;

public interface DisciplineBuilder {
    DisciplineBuilder setName(String name);
    DisciplineBuilder setCategory(ICategory category);
    DisciplineBuilder setAthlete(Participant athlete);
    IDiscipline build();
}