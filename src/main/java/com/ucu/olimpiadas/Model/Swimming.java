package com.ucu.olimpiadas.Model;

public class Swimming implements IDiscipline{
    private String name;
    private SwimmingCategory category;
    private Participant athlete;
    private double time;

    public Swimming(String name, SwimmingCategory category, Participant athlete, double time){
        this.name = name;
        this.category = category;
        this.athlete = athlete;
        this.time = time;
    }

    public String getName(){
        return name;
    }

    public SwimmingCategory getCategory(){
        return category;
    }

    public Participant getAthlete(){
        return athlete;
    }

    @Override
    public int calculatePoints() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
