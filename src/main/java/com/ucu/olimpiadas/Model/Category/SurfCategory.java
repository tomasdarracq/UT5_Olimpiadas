package com.ucu.olimpiadas.Model.Category;

public class SurfCategory implements ICategory {
    private String name;
    private String gender;
    public SurfCategory(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }

    public String getName() {
        return this.name;
    }

    public String getGender() {
        return gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
