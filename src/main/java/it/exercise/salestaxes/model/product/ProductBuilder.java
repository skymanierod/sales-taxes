package it.exercise.salestaxes.model.product;

import it.exercise.salestaxes.model.tax.Duty;
import it.exercise.salestaxes.model.tax.Vat;

public class ProductBuilder {
    private ProductInterface product;

    public ProductBuilder(ProductInterface product) {
        this.product = product;
    }

    public ProductBuilder withVat(){
        product = new Vat(product);
        return this;
    }

    public ProductBuilder withDuty(){
        product = new Duty(product);
        return this;
    }

    public ProductInterface build(){
        return product;
    }
}