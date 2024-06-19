package com.ucu.olimpiadas.Model;

public class Swimming implements IDiscipline{
    private String name;
    private String category;
    private double time;

    public Swimming(String name, String category, double time){
        this.name = name;
        this.category = category;
        this.time = time;
    }

    public String getName(){
        return name;
    }

    public String getCategory(){
        return category;
    }

    @Override
    public int calculatePoints() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
