package starter.Page;

import net.serenitybdd.screenplay.targets.Target;

public class CartPage {

    public static Target nameProduct(String nameProduct){
        return Target.the("name Product").locatedBy("//div[@class='CartItems_Title__x96Gd' and text()='" + nameProduct + "']");
    }

    static Target BUTTON_CHECK_OUT = Target.the("check out").locatedBy("//div[@class='CartItems_CartBoxRight__MIMD5']//button[text()='Checkout']");

}
