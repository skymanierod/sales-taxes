package it.exercise.salestaxes.model.cart;

import it.exercise.salestaxes.model.printer.SystemPrinter;

public class CartBuilder {
    private CartInterface cart;

    public CartBuilder(CartInterface cart) {
        this.cart = cart;
    }

    public CartBuilder withPrinter(){
        this.cart = new SystemPrinter(this.cart);
        return this;
    }

    public CartInterface build(){
        return this.cart;
    }
}
