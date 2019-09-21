package it.exercise.salestaxes.model.Tax;

import it.exercise.salestaxes.model.BaseTest;
import it.exercise.salestaxes.model.Product.Product;
import it.exercise.salestaxes.model.Product.ProductInterface;
import it.exercise.salestaxes.model.Tax.Duty;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static com.flextrade.jfixture.FixtureAnnotations.initFixtures;

public class DutyTest extends BaseTest {

    @Test
    public void shouldCalculateDuty(){
        ProductInterface product = new Duty(new Product(productName, BigDecimal.valueOf(10)));

        Assertions.assertEquals(BigDecimal.valueOf(0.5).setScale(2), product.getTax());

        product = new Duty(new Product(productName, BigDecimal.valueOf(10)));
    }

    @Test
    public void vatShouldBeEqualToZeroWhenProductHasPriceEqualToZero(){
        ProductInterface product = new Duty(new Product(productName, BigDecimal.valueOf(0)));

        Assertions.assertEquals(BigDecimal.ZERO.setScale(2), product.getTax());
    }

}
