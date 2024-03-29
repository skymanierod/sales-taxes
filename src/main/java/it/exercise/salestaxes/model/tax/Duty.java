package it.exercise.salestaxes.model.tax;

import it.exercise.salestaxes.model.product.ProductInterface;

import java.math.BigDecimal;

public class Duty extends Tax {

    public Duty(ProductInterface product){
        this.product = product;
    }

    @Override
    public String getProductName() {
        return product.getProductName();
    }

    @Override
    public BigDecimal getOriginalPrice() {
        return product.getOriginalPrice();
    }

    @Override
    public BigDecimal getTotalPrice() {
        return product.getTotalPrice().add(calculateDuty());
    }

    @Override
    public BigDecimal getTax() {
        return product.getTax().add(calculateDuty());
    }

    private BigDecimal calculateDuty(){
        return round(getDuty());
    }

    private BigDecimal getDuty(){
        return product.getOriginalPrice().divide(BigDecimal.valueOf(20));
    }

    @Override
    public int getQuantity() {
        return product.getQuantity();
    }
}
