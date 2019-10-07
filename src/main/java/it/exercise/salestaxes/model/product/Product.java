package it.exercise.salestaxes.model.product;

import lombok.NonNull;

import java.math.BigDecimal;

public class Product implements ProductInterface {

    private final String productName;
    protected final BigDecimal price;
    protected final int quantity;

    public Product(@NonNull String productName, @NonNull BigDecimal price, int quantity) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    @Override
    public int getQuantity() {
        return quantity;
    }

    @Override
    public String getProductName() {
        return productName;
    }

    @Override
    public BigDecimal getOriginalPrice() {
        return price;
    }

    @Override
    public BigDecimal getTotalPrice() {
        return price;
    }

    @Override
    public BigDecimal getTax() {
        return BigDecimal.ZERO;
    }

}
