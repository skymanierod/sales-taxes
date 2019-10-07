package it.exercise.salestaxes;


import it.exercise.salestaxes.model.ProductInput;
import it.exercise.salestaxes.model.cart.Cart;
import it.exercise.salestaxes.model.cart.CartBuilder;
import it.exercise.salestaxes.model.cart.CartInterface;
import it.exercise.salestaxes.model.product.Product;
import it.exercise.salestaxes.model.product.ProductBuilder;

import java.util.List;

public class App
{

    private App(){}

    public static void run(List<ProductInput> inputList){
        ProductBuilder builder;
        CartInterface cart = new CartBuilder(new Cart()).withPrinter().build();
        for (ProductInput p : inputList) {
            builder = new ProductBuilder(new Product(p.getName(),p.getPrice(),p.getQuantity()));
            if(p.isImported()){
                builder = builder.withDuty();
            }
            if (ProductInput.ProductType.STANDARD == p.getType()){
                    builder = builder.withVat();
            }
            cart.addToCart(builder.build());
        }
        cart.submitCart();
    }
}
