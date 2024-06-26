package com.ucu.olimpiadas.Model.Discipline;

import com.ucu.olimpiadas.Model.Category.SurfCategory;

public class Surf implements IDiscipline {
private String name;
    private SurfCategory category;
    private int athlete;
    private double dificulty;
    private double progretion;
    private double combination;
    private double style;

    public Surf(String name, SurfCategory category, int athlete, double dificulty, double progretion, double combination, double style) {
        this.name = name;
        this.category = category;
        this.athlete = athlete;
        this.dificulty = dificulty;
        this.progretion = progretion;
        this.combination = combination;
        this.style = style;
    }

    public String getName() {
        return name;
    }

    @Override
    public SurfCategory getCategory() {
        return category;
    }

    public int getAthlete() {
        return athlete;
    }

    public double calculatePoints() {
        return (dificulty + progretion + combination + style) / 4;
    }
}
