package it.exercise.salestaxes.model.product;

import java.math.BigDecimal;

public interface ProductInterface {

    String getProductName();
    BigDecimal getOriginalPrice();
    BigDecimal getTotalPrice();
    BigDecimal getTax();
    int getQuantity();
}
