package com.ucu.olimpiadas.Model.Discipline;

import com.ucu.olimpiadas.Model.Category.ICategory;

public interface IDiscipline {
    public String getName();
    public ICategory getCategory();
    public int getAthlete();
    public double calculatePoints();
}
