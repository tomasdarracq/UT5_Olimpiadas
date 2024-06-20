package com.ucu.olimpiadas.Service;

import com.ucu.olimpiadas.Dto.DisciplineDtos;
import com.ucu.olimpiadas.Model.Discipline.IDiscipline;
import com.ucu.olimpiadas.Model.Builder.SurfBuilder;
import com.ucu.olimpiadas.Model.Builder.SwimmingBuilder;
import com.ucu.olimpiadas.Model.Builder.WeightliftingBuilder;
import com.ucu.olimpiadas.Repository.DisciplineRepository;

import java.util.List;


public class DisciplineService {
    private final DisciplineRepository disciplineRepository = DisciplineRepository.getInstance();

    private static DisciplineService instance = null;

    private DisciplineService() {}

    public static DisciplineService getInstance() {
        if (instance == null) {
            instance = new DisciplineService();
        }
        return instance;
    }

    public List<IDiscipline> getDisciplines() {
        return disciplineRepository.getDisciplines();
    }

    public void addDiscipline(DisciplineDtos.genericDisciplineDto discipline) {
        if (discipline.clean_and_jerk_weight() != null) {
            WeightliftingBuilder builder = new WeightliftingBuilder();
            builder.setCleanAndJerkWeight(discipline.clean_and_jerk_weight());
            builder.setAthlete(discipline.athlete());
            builder.setCategory(discipline.category());
            builder.setSnatchWeight(discipline.snatch_weight());
            builder.setName(discipline.name());
            disciplineRepository.addDiscipline(builder.build());

        } else if (discipline.style() != null) {
            SurfBuilder builder = new SurfBuilder();
            builder.setStyle(discipline.style());
            builder.setAthlete(discipline.athlete());
            builder.setCategory(discipline.category());
            builder.setCombination(discipline.combination());
            builder.setDificulty(discipline.dificulty());
            builder.setProgretion(discipline.progretion());
            builder.setName(discipline.name());
            disciplineRepository.addDiscipline(builder.build());

        } else if (discipline.time() != null) {
            SwimmingBuilder builder = new SwimmingBuilder();
            builder.setTime(discipline.time());
            builder.setAthlete(discipline.athlete());
            builder.setCategory(discipline.category());
            builder.setName(discipline.name());
            disciplineRepository.addDiscipline(builder.build());
        }
    }


    public Object getDisciplineByNameAndParticipant(String name, int participant) {
        return disciplineRepository.getDisciplineByNameAndParticipant(name, participant);
    }
}
