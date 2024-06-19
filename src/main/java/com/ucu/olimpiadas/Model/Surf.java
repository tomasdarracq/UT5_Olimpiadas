package com.ucu.olimpiadas.Model;

public class Surf implements IDiscipline{
private String name;
    private String category;
    private double dificulty;
    private double progretion;
    private double combination;
    private double style;

    public Surf(String name, String category, double dificulty, double progretion, double combination, double style) {
        this.name = name;
        this.category = category;
        this.dificulty = dificulty;
        this.progretion = progretion;
        this.combination = combination;
        this.style = style;
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
