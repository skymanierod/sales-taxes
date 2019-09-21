package it.exercise.salestaxes.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.math.BigDecimal;

public class TaxTest extends BaseTest {

    @Test
    public void shouldRoundUpToNearestFiveCents(){
        Tax tax =  Mockito.mock(Tax.class, Mockito.CALLS_REAL_METHODS);

        Assertions.assertEquals(BigDecimal.valueOf(0.55).setScale(2),tax.round(BigDecimal.valueOf(0.51)));
        Assertions.assertEquals(BigDecimal.valueOf(0.60).setScale(2),tax.round(BigDecimal.valueOf(0.56)));
    }

}
