package it.exercise.salestaxes.model;

import org.junit.jupiter.api.Assertions;

import java.math.BigDecimal;

public class ProductTest extends BaseTest {

    public void shouldCreateProductWithNameAndPrice(){
        Product product = new Product(productName,price);

        Assertions.assertNotNull(product);
        Assertions.assertEquals(productName, product.getProductName());
        Assertions.assertEquals(price, product.getOriginalPrice());
    }

    public void shouldCreateProductWithoutTaxesAndWithTotalPriceEqualToOriginalPrices(){
        Product product = new Product(productName,price);

        Assertions.assertEquals(BigDecimal.ZERO, product.getTax());
        Assertions.assertEquals(price, product.getOriginalPrice());
    }

    public void shouldThrowNullPointerExceptionWhenProductNameOrPriceAreNull(){
        Assertions.assertThrows(NullPointerException.class, () -> new Product(productName,null));
        Assertions.assertThrows(NullPointerException.class, () -> new Product(null, price));
    }
}
