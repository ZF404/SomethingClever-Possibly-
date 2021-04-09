package com.example.easyenergysaver;

public class HomeDataUnit {
    private int name;
    private String data;

    public HomeDataUnit(int name, String data) {
        this.name = name;
        this.data = data;
    }

    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
