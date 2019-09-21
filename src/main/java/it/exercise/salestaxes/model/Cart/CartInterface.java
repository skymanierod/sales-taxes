package it.exercise.salestaxes.model.Cart;

import it.exercise.salestaxes.model.Product.ProductInterface;

import java.math.BigDecimal;
import java.util.List;

public interface CartInterface {

    void addToCart(ProductInterface product);
    void submitCart();
    BigDecimal getTotalPrice();
    BigDecimal getTotalSalesTaxes();
    List<ProductInterface> getProducts();

}
