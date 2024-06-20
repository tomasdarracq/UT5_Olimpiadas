package com.ucu.olimpiadas.Dto;

import com.ucu.olimpiadas.Model.Category.ICategory;

public class DisciplineDtos {
    public record genericDisciplineDto(
            String name,
            ICategory category,
            Integer athlete,
            Double time,
            Double dificulty,
            Double progretion,
            Double combination,
            Double style,
            Double snatch_weight,
            Double clean_and_jerk_weight
    ){}
}
