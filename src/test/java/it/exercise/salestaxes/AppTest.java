package it.exercise.salestaxes;

import it.exercise.salestaxes.App;
import it.exercise.salestaxes.model.ProductInput;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AppTest {

    @Test
    public void shouldWorkWithFirstInput(){
        List<ProductInput> products = new ArrayList<>();
        products.add(buildInputProduct("book", BigDecimal.valueOf(12.49),false, ProductInput.ProductType.BOOK));
        products.add(buildInputProduct("music CD", BigDecimal.valueOf(14.99),false, ProductInput.ProductType.STANDARD));
        products.add(buildInputProduct("chocolate bar", BigDecimal.valueOf(0.85),false, ProductInput.ProductType.FOOD));
        App.run(products);
    }

    @Test
    public void shouldWorkWithSecondInput(){
        List<ProductInput> products = new ArrayList<>();
        products.add(buildInputProduct("imported box of chocolates", BigDecimal.valueOf(10.00),true, ProductInput.ProductType.FOOD));
        products.add(buildInputProduct("imported bottle of perfume", BigDecimal.valueOf(47.50),true, ProductInput.ProductType.STANDARD));
        App.run(products);
    }

    @Test
    public void shouldWorkWithThirdInput(){
        List<ProductInput> products = new ArrayList<>();
        products.add(buildInputProduct("imported bottle of perfume", BigDecimal.valueOf(27.99),true, ProductInput.ProductType.STANDARD));
        products.add(buildInputProduct("bottle of perfume", BigDecimal.valueOf(18.99),false, ProductInput.ProductType.STANDARD));
        products.add(buildInputProduct("packet of headache pills", BigDecimal.valueOf(9.75),false, ProductInput.ProductType.MEDICAL));
        products.add(buildInputProduct("box of imported chocolates", BigDecimal.valueOf(11.25),true, ProductInput.ProductType.FOOD));
        App.run(products);
    }

    private ProductInput buildInputProduct(String name, BigDecimal price, boolean isImported, ProductInput.ProductType type){
        return new ProductInput(name, price, isImported, type);
    }
}
