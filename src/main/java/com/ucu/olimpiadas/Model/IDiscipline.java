package com.ucu.olimpiadas.Model;

import jakarta.servlet.http.Part;

public interface IDiscipline {
    public String getName();
    public ICategory getCategory();
    public Participant getAthlete();
    public int calculatePoints();
}
