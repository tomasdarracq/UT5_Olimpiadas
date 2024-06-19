package com.ucu.olimpiadas.Model;

public class Weightlifting implements IDiscipline{
    private String name;
    private String category;
    private int snatch_weight;
    private int clean_and_jerk_weight;

    public Weightlifting(String name, String category, int snatch_weight, int clean_and_jerk_weight) {
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
    public int calculatePoints() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
