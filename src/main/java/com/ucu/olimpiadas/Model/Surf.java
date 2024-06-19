package com.ucu.olimpiadas.Model;

public class Surf implements IDiscipline{
private String name;
    private SurfCategory category;
    private Participant athlete;
    private double dificulty;
    private double progretion;
    private double combination;
    private double style;

    public Surf(String name, SurfCategory category, Participant athlete, double dificulty, double progretion, double combination, double style) {
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

    public Participant getAthlete() {
        return athlete;
    }

    public int calculatePoints() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
