package it.exercise.salestaxes.model.Cart;

import it.exercise.salestaxes.model.BaseTest;
import it.exercise.salestaxes.model.Cart.Cart;
import it.exercise.salestaxes.model.Cart.CartInterface;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class CartTest extends BaseTest {

    @Test
    public void shouldCreateCartWithEmptyProducsListAndTotalPriceAndTotalTaxEqualToZero(){
        CartInterface cart = new Cart();

        Assertions.assertEquals(BigDecimal.ZERO,cart.getTotalPrice());
        Assertions.assertEquals(BigDecimal.ZERO,cart.getTotalSalesTaxes());
        Assertions.assertNotNull(cart.getProducts());
        Assertions.assertTrue(cart.getProducts().isEmpty());
    }

    @Test
    public void shouldAddProductToCartAndUpdatePriceAndTax(){
        CartInterface cart = new Cart();
        cart.addToCart(product);

        Assertions.assertEquals(1,cart.getProducts().size());
        Assertions.assertEquals(product,cart.getProducts().get(0));
        Assertions.assertEquals(product.getTotalPrice(),cart.getTotalPrice());
        Assertions.assertEquals(product.getTax(),cart.getTotalSalesTaxes());
    }

}
