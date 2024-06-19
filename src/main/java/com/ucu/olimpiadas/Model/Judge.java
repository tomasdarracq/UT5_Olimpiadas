package com.ucu.olimpiadas.Model;

public class Judge implements IPerson {
    private String name;
    private String password;
    private String address;
    private int ci;

    public Judge(String name, String address, int ci) {
        this.name = name;
        this.address = address;
        this.ci = ci;
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
    public int getCI() {
        return ci;
    }

    @Override
    public void setCI(int ci) {
        this.ci = ci;
    }

    @Override
    public String getAddress() {
        return address;
    }

    @Override
    public void setAddress(String address) {
        this.address = address;
    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
