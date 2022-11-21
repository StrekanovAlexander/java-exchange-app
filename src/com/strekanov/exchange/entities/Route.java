package com.strekanov.exchange.entities;

public enum Route {

    IN("Input"),
    OUT("Output");

    public final String label;

    Route(String label) {
        this.label = label;
    }

}
