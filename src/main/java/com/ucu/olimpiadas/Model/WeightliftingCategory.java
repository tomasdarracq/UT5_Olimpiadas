package com.ucu.olimpiadas.Model;

public class WeightliftingCategory implements ICategory{
    private String name;
    private String gender;
    private String weight;

    public WeightliftingCategory(String name, String gender, String weight) {
        this.name = name;
        this.gender = gender;
        this.weight = weight;
    }

    public String getName() {
        return this.name;
    }

    public String getGender() {
        return gender;
    }

    public String getWeight() {
        return weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }
}
