package com.ucu.olimpiadas.Model;

public class Participant implements IPerson {
    private String name;
    private String address;
    private String cedula;
    private IDiscipline discipline;

    public Participant(String name, String address, String cedula) {
        this.name = name;
        this.address = address;
        this.cedula = cedula;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getCedula() {
        return cedula;
    }

    @Override
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    @Override
    public String getAddress() {
        return address;
    }

    @Override
    public void setAddress(String address) {
        this.address = address;
    }

    public IDiscipline getDiscipline() {
        return discipline;
    }

    public void setDiscipline(IDiscipline discipline) {
        this.discipline = discipline;
    }
}
