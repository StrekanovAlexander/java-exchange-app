package com.strekanov.exchange.entities;

import com.strekanov.person.Person;

public class Customer extends Person {
    private int discount;

    public Customer(int id, String name, int discount) {
        super(id, name);
        this.discount = discount;
    }

    public int getDiscount() {
        return this.discount;
    }

    @Override
    public String toString() {
        return "Customer info\nid: " + super.getId() +
                "\nname: " + super.getName() +
                "\ndiscount: " + this.discount;
    }

}
