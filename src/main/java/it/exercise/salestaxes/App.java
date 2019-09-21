package it.exercise.salestaxes;


import it.exercise.salestaxes.model.*;

import java.util.ArrayList;
import java.util.List;

public class App
{

    public static void run(List<ProductInput> inputList){
        ProductBuilder builder;
        CartInterface cart = new CartBuilder(new Cart()).withPrinter().build();
        List<ProductInterface> products = new ArrayList<>();
        for (ProductInput p : inputList) {
            builder = new ProductBuilder(new Product(p.getName(),p.getPrice()));
            if(p.isImported()){
                builder = builder.withDuty();
            }
            switch (p.getType()){
                case STANDARD:
                    builder = builder.withVat();
                    break;
            }
            cart.addToCart(builder.build());
        }
        cart.submitCart();
    }
}
