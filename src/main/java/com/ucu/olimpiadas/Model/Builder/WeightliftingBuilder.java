package com.ucu.olimpiadas.Model.Builder;

import com.ucu.olimpiadas.Model.Discipline.Weightlifting;
import com.ucu.olimpiadas.Model.Category.ICategory;
import com.ucu.olimpiadas.Model.Category.WeightliftingCategory;

public class WeightliftingBuilder implements DisciplineBuilder {
    private String name;
    private WeightliftingCategory category;
    private int athlete;
    private double snatch_weight;
    private double clean_and_jerk_weight;

    @Override
    public WeightliftingBuilder setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public DisciplineBuilder setCategory(ICategory category) {
        this.category = (WeightliftingCategory) category;
        return this;
    }

    @Override
    public WeightliftingBuilder setAthlete(int athlete) {
        this.athlete = athlete;
        return this;
    }

    public WeightliftingBuilder setSnatchWeight(double snatch_weight) {
        this.snatch_weight = snatch_weight;
        return this;
    }

    public WeightliftingBuilder setCleanAndJerkWeight(double clean_and_jerk_weight) {
        this.clean_and_jerk_weight = clean_and_jerk_weight;
        return this;
    }

    @Override
    public Weightlifting build() {
        return new Weightlifting(name, category, athlete, snatch_weight, clean_and_jerk_weight);
    }
}