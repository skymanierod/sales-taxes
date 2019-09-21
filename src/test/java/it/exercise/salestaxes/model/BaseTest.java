package it.exercise.salestaxes.model;

import com.flextrade.jfixture.annotations.Fixture;
import it.exercise.salestaxes.model.Product;
import org.junit.jupiter.api.BeforeEach;

import java.math.BigDecimal;

import static com.flextrade.jfixture.FixtureAnnotations.initFixtures;

public class BaseTest {

    @Fixture
    protected String productName;
    @Fixture
    protected BigDecimal price;
    @Fixture
    protected Product product;

    @BeforeEach
    void setup() {
        initFixtures(this);
    }
}
