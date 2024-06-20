package com.ucu.olimpiadas.Repository;

import com.ucu.olimpiadas.Model.Discipline.IDiscipline;

import java.util.ArrayList;
import java.util.List;

public class DisciplineRepository {

    private static DisciplineRepository instance = null;
    private List<IDiscipline> disciplines;

    private DisciplineRepository() {
        disciplines = new ArrayList<>();
    }

    public static DisciplineRepository getInstance() {
        if (instance == null) {
            instance = new DisciplineRepository();
        }
        return instance;
    }

    public void addDiscipline(IDiscipline discipline) {
        disciplines.add(discipline);
    }

    public List<IDiscipline> getDisciplines() {
        return disciplines;
    }

    public IDiscipline getDisciplineByNameAndParticipant(String name, int participant) {
        for (IDiscipline discipline : disciplines) {
            if (discipline.getName().equals(name) && discipline.getAthlete() == participant){
                return discipline;
            }
        }
        return null;
    }
}


