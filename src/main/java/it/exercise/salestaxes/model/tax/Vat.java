package it.exercise.salestaxes.model.tax;

import it.exercise.salestaxes.model.product.ProductInterface;

import java.math.BigDecimal;

public class Vat extends Tax {

    public Vat(ProductInterface product){
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
        return product.getTotalPrice().add(calculateVat());
    }

    @Override
    public BigDecimal getTax() {
        return product.getTax().add(calculateVat());
    }

    private BigDecimal calculateVat(){
        return round(getVat());
    }

    private BigDecimal getVat(){
        return product.getOriginalPrice().divide(BigDecimal.TEN);
    }

    @Override
    public int getQuantity() {
        return product.getQuantity();
    }
}
