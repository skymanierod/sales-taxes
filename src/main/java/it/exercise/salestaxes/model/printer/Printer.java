package it.exercise.salestaxes.model.printer;

import it.exercise.salestaxes.model.cart.CartInterface;

public abstract class Printer implements CartInterface {
    protected CartInterface cart;
}
