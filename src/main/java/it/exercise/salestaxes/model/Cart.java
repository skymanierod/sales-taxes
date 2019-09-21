package it.exercise.salestaxes.model;

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
        //submit cart somewhere..
        /*for (ProductInterface p: products) {
            System.out.println(getLineItemBillRow(p));
        }
        System.out.println(getSalesTaxesBillRow());
        System.out.println(getTotalPriceBillRow());*/
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

    /*private void printLineItem(ProductInterface product){
        System.out.println(getLineItemBillRow(product));
    }

    public String getLineItemBillRow(ProductInterface product){
        return product.getProductName() + " : "+ product.getTotalPrice().setScale(2);
    }

    public String getTotalPriceBillRow(){
        return "Total : " + totalPrice.setScale(2);
    }

    public String getSalesTaxesBillRow(){
        return "Sales Taxes : " + totalSalesTaxes.setScale(2);
    }*/
}
