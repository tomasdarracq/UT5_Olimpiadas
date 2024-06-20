package com.ucu.olimpiadas.Model.Builder;

import com.ucu.olimpiadas.Model.Discipline.Surf;
import com.ucu.olimpiadas.Model.Category.ICategory;
import com.ucu.olimpiadas.Model.Category.SurfCategory;

public class SurfBuilder implements DisciplineBuilder {
    private String name;
    private SurfCategory category;
    private int athlete;
    private double dificulty;
    private double progretion;
    private double combination;
    private double style;


    @Override
    public DisciplineBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public SurfCategory getCategory(ICategory category) {
        return this.category;
    }

    @Override
    public DisciplineBuilder setCategory(ICategory category) {
        this.category = (SurfCategory) category;
        return this;
    }

    @Override
    public DisciplineBuilder setAthlete(int athlete) {
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
