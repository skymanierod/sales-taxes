package it.exercise.salestaxes.model.Tax;

import it.exercise.salestaxes.model.Product.ProductInterface;

import java.math.BigDecimal;
import java.math.RoundingMode;

public abstract class Tax implements ProductInterface {
    protected ProductInterface product;
    protected static final BigDecimal taxRoundValue=BigDecimal.valueOf(0.05);

    protected BigDecimal round(BigDecimal value) {
        BigDecimal divided = value.divide(taxRoundValue, 0, RoundingMode.UP);
        BigDecimal result = divided.multiply(taxRoundValue);
        return result;
    }


}
