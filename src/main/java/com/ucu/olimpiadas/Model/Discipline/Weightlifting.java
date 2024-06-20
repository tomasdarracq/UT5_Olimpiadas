package com.ucu.olimpiadas.Model.Discipline;

import com.ucu.olimpiadas.Model.Category.WeightliftingCategory;

public class Weightlifting implements IDiscipline {
    private String name;
    private WeightliftingCategory category;
    private int participant;
    private double snatch_weight;
    private double clean_and_jerk_weight;

    public Weightlifting(String name, WeightliftingCategory category, int participant, double snatch_weight, double clean_and_jerk_weight) {
        this.name = name;
        this.category = category;
        this.participant = participant;
        this.snatch_weight = snatch_weight;
        this.clean_and_jerk_weight = clean_and_jerk_weight;
    }
    public String getName() {
        return name;
    }
    @Override
    public WeightliftingCategory getCategory() {
        return category;
    }
    public int getAthlete() {
        return participant;
    }
    public double calculatePoints() {
        return snatch_weight + clean_and_jerk_weight;
    }
}
