package com.ucu.olimpiadas.Model;

public class Weightlifting implements IDiscipline{
    private String name;
    private String category;
    private Participant participant;
    private double snatch_weight;
    private double clean_and_jerk_weight;

    public Weightlifting(String name, String category, double snatch_weight, double clean_and_jerk_weight) {
        this.name = name;
        this.category = category;
        this.snatch_weight = snatch_weight;
        this.clean_and_jerk_weight = clean_and_jerk_weight;
    }
    public String getName() {
        return name;
    }
    public String getCategory() {
        return category;
    }
    public Participant getAthlete() {
        return participant;
    }
    public int calculatePoints() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
