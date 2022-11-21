package com.strekanov.exchange.entities;

import com.strekanov.currency.Currency;

public class Operation {

    private static int id = 0;
    private Route route;
    private Currency currency;
    private double qty;
    private double rate;
    private double total;

    public Operation(Route route, Currency currency, double qty, double rate) {
        id += 1;
        this.route = route;
        this.currency = currency;
        this.qty = qty;
        this.rate = rate;
        this.total = this.qty * this.rate;
    }

    @Override
    public String toString() {
        return "id: " + Integer.toString(id) +
                "\nroute: " + this.route.label +
                "\ncurrency: " + this.currency.getName() +
                "\nqty: " + this.qty +
                "\nrate: " + this.rate +
                "\ntotal: " + this.total;
    }

}
