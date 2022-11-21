package com.strekanov.currency;

public class Currency {
    private String id;
    private String name;

    public Currency(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "Currency id: " + this.id + " name: " + this.name;
    }
}
