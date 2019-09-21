package it.exercise.salestaxes.model;

import java.math.BigDecimal;

public interface ProductInterface {

    String getProductName();
    BigDecimal getOriginalPrice();
    BigDecimal getTotalPrice();
    BigDecimal getTax();

}