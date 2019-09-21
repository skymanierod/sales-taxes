package it.exercise.salestaxes.model.Product;

import it.exercise.salestaxes.model.Tax.Duty;
import it.exercise.salestaxes.model.Tax.Vat;

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