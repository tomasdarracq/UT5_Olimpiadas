package com.ucu.olimpiadas.Model;

public class SurfBuilder implements DisciplineBuilder{
    private String name;
    private String category;
    private Participant athlete;
    private double dificulty;
    private double progretion;
    private double combination;
    private double style;


    @Override
    public DisciplineBuilder setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public DisciplineBuilder setCategory(String category) {
        this.category = category;
        return this;
    }

    @Override
    public DisciplineBuilder setAthlete(Participant athlete) {
        this.athlete = athlete;
        return this;
    }

    public DisciplineBuilder setDificulty(double dificulty) {
        this.dificulty = dificulty;
        return this;
    }

    public DisciplineBuilder setProgretion(double progretion) {
        this.progretion = progretion;
        return this;
    }

    public DisciplineBuilder setCombination(double combination) {
        this.combination = combination;
        return this;
    }

    public DisciplineBuilder setStyle(double style) {
        this.style = style;
        return this;
    }

    @Override
    public Surf build() {
        return new Surf(name, category, athlete, dificulty, progretion, combination, style);
    }
}
