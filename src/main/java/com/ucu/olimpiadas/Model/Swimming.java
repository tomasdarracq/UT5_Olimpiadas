package com.ucu.olimpiadas.Model;

public class Swimming implements IDiscipline{
    private String name;
    private String category;
    private Participant athlete;
    private double time;

    public Swimming(String name, String category, Participant athlete, double time){
        this.name = name;
        this.category = category;
        this.athlete = athlete;
        this.time = time;
    }

    public String getName(){
        return name;
    }

    public String getCategory(){
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
