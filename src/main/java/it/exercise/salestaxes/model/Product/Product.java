package it.exercise.salestaxes.model.Product;

import lombok.NonNull;

import java.math.BigDecimal;

public class Product implements ProductInterface {

    private final String productName;
    protected final BigDecimal price;

    public Product(@NonNull String productName, @NonNull BigDecimal price) {
        this.productName = productName;
        this.price = price;
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
