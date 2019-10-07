package it.exercise.salestaxes.model.tax;

import it.exercise.salestaxes.model.BaseTest;
import it.exercise.salestaxes.model.product.Product;
import it.exercise.salestaxes.model.product.ProductInterface;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class VatTest extends BaseTest {

    @Test
    public void shouldCalculateVat(){
        ProductInterface product = new Vat(new Product(productName, BigDecimal.valueOf(10),1));

        Assertions.assertEquals(BigDecimal.valueOf(1).setScale(2), product.getTax());
    }

    @Test
    public void vatShouldBeEqualToZeroWhenProductHasPriceEqualToZero(){
        ProductInterface product = new Vat(new Product(productName, BigDecimal.valueOf(0),1));

        Assertions.assertEquals(BigDecimal.ZERO.setScale(2), product.getTax());
    }

}
