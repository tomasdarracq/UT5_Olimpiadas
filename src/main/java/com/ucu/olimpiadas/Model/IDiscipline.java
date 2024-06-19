package com.ucu.olimpiadas.Model;

public interface IDiscipline {
    public String getName();
    public ICategory getCategory();
    public Participant getAthlete();
    public double calculatePoints();
}
