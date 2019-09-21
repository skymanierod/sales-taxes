package it.exercise.salestaxes;


import it.exercise.salestaxes.model.*;
import it.exercise.salestaxes.model.Cart.Cart;
import it.exercise.salestaxes.model.Cart.CartBuilder;
import it.exercise.salestaxes.model.Cart.CartInterface;
import it.exercise.salestaxes.model.Product.Product;
import it.exercise.salestaxes.model.Product.ProductBuilder;
import it.exercise.salestaxes.model.Product.ProductInterface;

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
