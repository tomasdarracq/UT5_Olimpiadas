package com.ucu.olimpiadas.Model.Discipline;

import com.ucu.olimpiadas.Model.Category.SwimmingCategory;

public class Swimming implements IDiscipline {
    private String name;
    private SwimmingCategory category;
    private int athlete;
    private double time;

    public Swimming(String name, SwimmingCategory category, int athlete, double time){
        this.name = name;
        this.category = category;
        this.athlete = athlete;
        this.time = time;
    }

    public String getName(){
        return name;
    }
    @Override
    public SwimmingCategory getCategory(){
        return category;
    }

    public int getAthlete(){
        return athlete;
    }

    @Override
    public double calculatePoints() {
        return time;
    }
}
