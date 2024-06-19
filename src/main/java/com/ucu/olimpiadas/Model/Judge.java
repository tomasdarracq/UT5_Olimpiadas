package com.ucu.olimpiadas.Model;

public class Judge implements IPerson {
    private String name;
    private String id;
    private String password;
    private String address;
    private String cedula;

    public Judge(String name, String id, String address, String cedula) {
        this.name = name;
        this.id = id;
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
