package it.exercise.salestaxes.model.Cart;

import it.exercise.salestaxes.model.Printer.SystemPrinter;

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
