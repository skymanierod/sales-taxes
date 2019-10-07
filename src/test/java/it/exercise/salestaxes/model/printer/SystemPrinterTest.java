package it.exercise.salestaxes.model.printer;

import it.exercise.salestaxes.model.BaseTest;
import it.exercise.salestaxes.model.cart.Cart;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SystemPrinterTest extends BaseTest {

    @Test
    public void shouldPrintTotalAndVatAndProductBillRow(){
        SystemPrinter systemPrinter = new SystemPrinter(new Cart());
        systemPrinter.addToCart(product);

        Assertions.assertEquals("Total : "+product.getTotalPrice().setScale(2),systemPrinter.getTotalPriceBillRow());
        Assertions.assertEquals("Sales Taxes : "+product.getTax().setScale(2),systemPrinter.getSalesTaxesBillRow());
        Assertions.assertEquals(product.getQuantity() +" "+ product.getProductName()+" : "+product.getTotalPrice().setScale(2),systemPrinter.getLineItemBillRow(product));
    }
}
