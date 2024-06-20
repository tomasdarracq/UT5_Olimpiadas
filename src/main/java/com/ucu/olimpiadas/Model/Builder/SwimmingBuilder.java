package com.ucu.olimpiadas.Model.Builder;

import com.ucu.olimpiadas.Model.Discipline.Swimming;
import com.ucu.olimpiadas.Model.Category.ICategory;
import com.ucu.olimpiadas.Model.Category.SwimmingCategory;

public class SwimmingBuilder implements DisciplineBuilder {
    private String name;
    private SwimmingCategory category;
    private int athlete;
    private double time;

    @Override
    public SwimmingBuilder setName(String name){
        this.name = name;
        return this;
    }

    @Override
    public DisciplineBuilder setCategory(ICategory category) {
        this.category = (SwimmingCategory) category;
        return this;
    }

    public SwimmingBuilder setCategory(SwimmingCategory category){
        this.category = category;
        return this;
    }

    @Override
    public SwimmingBuilder setAthlete(int athlete){
        this.athlete = athlete;
        return this;
    }

    public SwimmingBuilder setTime(double time){
        this.time = time;
        return this;
    }

    @Override
    public Swimming build(){
        return new Swimming(name, category, athlete, time);
    }


}
