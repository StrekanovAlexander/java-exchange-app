package com.strekanov.exchange;

import com.strekanov.currency.Currency;
import com.strekanov.exchange.entities.*;

public class Main {
    public static void main(String[] args) {

        Currency currency = new Currency("1", "USD");
        Operation operation = new Operation(Route.IN, currency, 100.0, 27.5 );
        System.out.println(operation);

    }
}
