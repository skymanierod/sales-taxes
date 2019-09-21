package it.exercise.salestaxes.model.Tax;

import it.exercise.salestaxes.model.BaseTest;
import it.exercise.salestaxes.model.Product.Product;
import it.exercise.salestaxes.model.Product.ProductInterface;
import it.exercise.salestaxes.model.Tax.Vat;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static com.flextrade.jfixture.FixtureAnnotations.initFixtures;
import static java.util.stream.Collectors.toMap;

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
