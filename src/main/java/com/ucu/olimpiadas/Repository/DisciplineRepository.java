package com.ucu.olimpiadas.Repository;

import java.util.ArrayList;
import java.util.List;

public class DisciplineRepository {

    private static DisciplineRepository instance = null;
    private List<String> disciplines;

    private DisciplineRepository() {
        disciplines = new ArrayList<>();
    }

    public static synchronized DisciplineRepository getInstance() {
        if (instance == null) {
            instance = new DisciplineRepository();
        }
        return instance;
    }

    public void addDiscipline(String discipline) {
        disciplines.add(discipline);
    }

    public List<String> getDisciplines() {
        return disciplines;
    }
}


