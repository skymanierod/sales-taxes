package it.exercise.salestaxes.model.Printer;

import it.exercise.salestaxes.model.Cart.CartInterface;
import it.exercise.salestaxes.model.Product.ProductInterface;

import java.math.BigDecimal;
import java.util.List;

public class SystemPrinter extends Printer {

    public SystemPrinter(CartInterface cart){
        this.cart = cart;
    }

    @Override
    public void addToCart(ProductInterface product) {
        this.cart.addToCart(product);
    }

    @Override
    public void submitCart() {
        cart.submitCart();
        for (ProductInterface p: cart.getProducts()) {
            System.out.println(getLineItemBillRow(p));
        }
        System.out.println(getSalesTaxesBillRow());
        System.out.println(getTotalPriceBillRow());
    }

    @Override
    public BigDecimal getTotalPrice() {
        return this.cart.getTotalPrice();
    }

    @Override
    public BigDecimal getTotalSalesTaxes() {
        return this.cart.getTotalSalesTaxes();
    }

    @Override
    public List<ProductInterface> getProducts() {
        return this.getProducts();
    }

    public String getLineItemBillRow(ProductInterface product){
        return product.getProductName() + " : "+ product.getTotalPrice().setScale(2);
    }

    public String getTotalPriceBillRow(){
        return "Total : " + cart.getTotalPrice().setScale(2);
    }

    public String getSalesTaxesBillRow(){
        return "Sales Taxes : " + cart.getTotalSalesTaxes().setScale(2);
    }
}
