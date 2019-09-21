package it.exercise.salestaxes.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static com.flextrade.jfixture.FixtureAnnotations.initFixtures;
import static java.util.stream.Collectors.toMap;

public class VatTest extends BaseTest{

    @Test
    public void shouldCalculateVat(){
        ProductInterface product = new Vat(new Product(productName, BigDecimal.valueOf(10)));

        Assertions.assertEquals(BigDecimal.valueOf(1).setScale(2), product.getTax());
    }

    @Test
    public void vatShouldBeEqualToZeroWhenProductHasPriceEqualToZero(){
        ProductInterface product = new Vat(new Product(productName, BigDecimal.valueOf(0)));

        Assertions.assertEquals(BigDecimal.ZERO.setScale(2), product.getTax());
    }

}
