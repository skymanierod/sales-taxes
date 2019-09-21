package it.exercise.salestaxes.model.Product;

import it.exercise.salestaxes.model.BaseTest;
import it.exercise.salestaxes.model.Product.Product;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class ProductTest extends BaseTest {

    @Test
    public void shouldCreateProductWithNameAndPrice(){
        Product product = new Product(productName,price,1);

        Assertions.assertNotNull(product);
        Assertions.assertEquals(productName, product.getProductName());
        Assertions.assertEquals(price, product.getOriginalPrice());
    }

    @Test
    public void shouldCreateProductWithoutTaxesAndWithTotalPriceEqualToOriginalPrices(){
        Product product = new Product(productName,price,1);

        Assertions.assertEquals(BigDecimal.ZERO, product.getTax());
        Assertions.assertEquals(price, product.getOriginalPrice());
    }

    @Test
    public void shouldThrowNullPointerExceptionWhenProductNameOrPriceAreNull(){
        Assertions.assertThrows(NullPointerException.class, () -> new Product(productName,null,1));
        Assertions.assertThrows(NullPointerException.class, () -> new Product(null, price,1));
    }
}
