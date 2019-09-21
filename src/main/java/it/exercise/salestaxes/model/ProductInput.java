package it.exercise.salestaxes.model;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class ProductInput {

    private final String name;
    private final BigDecimal price;
    private final boolean isImported;
    private final ProductType type;

    public enum ProductType{
        STANDARD,
        FOOD,
        BOOK,
        MEDICAL;
    }
}
