package it.exercise.salestaxes.model.cart;

import it.exercise.salestaxes.model.product.ProductInterface;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Cart implements CartInterface{

    private final List<ProductInterface> products = new ArrayList<>();
    private BigDecimal totalPrice = BigDecimal.ZERO;
    private BigDecimal totalSalesTaxes = BigDecimal.ZERO;

    @Override
    public void addToCart(ProductInterface product) {
        addProductToCart(product);
        updateCartPrice(product);
        updateCartTaxes(product);
    }

    @Override
    public void submitCart() {
        //Do stuff to save cart..
    }

    @Override
    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    @Override
    public BigDecimal getTotalSalesTaxes() {
        return totalSalesTaxes;
    }

    @Override
    public List<ProductInterface> getProducts() {
        return products;
    }

    private void addProductToCart(ProductInterface product){
        products.add(product);
    }

    private void updateCartPrice(ProductInterface product){
        totalPrice = totalPrice.add(product.getTotalPrice());
    }

    private void updateCartTaxes(ProductInterface product){
        totalSalesTaxes = totalSalesTaxes.add(product.getTax());
    }

}
