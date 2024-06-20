package com.ucu.olimpiadas.Model.Builder;

import com.ucu.olimpiadas.Model.Discipline.IDiscipline;
import com.ucu.olimpiadas.Model.Category.ICategory;

public interface DisciplineBuilder {
    DisciplineBuilder setName(String name);
    DisciplineBuilder setCategory(ICategory category);
    DisciplineBuilder setAthlete(int athlete);
    IDiscipline build();
}