package com.ucu.olimpiadas.Model;

public class WeightliftingBuilder implements DisciplineBuilder {
    private String name;
    private WeightliftingCategory category;
    private Participant athlete;
    private double snatch_weight;
    private double clean_and_jerk_weight;

    @Override
    public WeightliftingBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public WeightliftingBuilder setCategory(WeightliftingCategory category) {
        this.category = category;
        return this;
    }

    @Override
    public WeightliftingBuilder setAthlete(Participant athlete) {
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
        return new Weightlifting(name, category, snatch_weight, clean_and_jerk_weight);
    }
}