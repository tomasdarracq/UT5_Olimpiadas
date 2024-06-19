package com.ucu.olimpiadas.Model;

public class WeightliftingBuilder implements DisciplineBuilder {
    private String name;
    private String category;
    private int snatch_weight;
    private int clean_and_jerk_weight;

    @Override
    public WeightliftingBuilder setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public WeightliftingBuilder setCategory(String category) {
        this.category = category;
        return this;
    }

    public WeightliftingBuilder setSnatchWeight(int snatch_weight) {
        this.snatch_weight = snatch_weight;
        return this;
    }

    public WeightliftingBuilder setCleanAndJerkWeight(int clean_and_jerk_weight) {
        this.clean_and_jerk_weight = clean_and_jerk_weight;
        return this;
    }

    @Override
    public Weightlifting build() {
        return new Weightlifting(name, category, snatch_weight, clean_and_jerk_weight);
    }
}