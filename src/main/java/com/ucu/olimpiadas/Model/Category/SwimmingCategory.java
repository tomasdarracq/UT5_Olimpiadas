package com.ucu.olimpiadas.Model.Category;

public class SwimmingCategory implements ICategory {
    private String name;
    private String gender;
    private String style;

    public SwimmingCategory(String name, String gender, String style) {
        this.name = name;
        this.gender = gender;
        this.style = style;
    }

    public String getName() {
        return this.name;
    }

    public String getGender() {
        return gender;
    }

    public String getStyle() {
        return style;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setStyle(String style) {
        this.style = style;
    }
}
