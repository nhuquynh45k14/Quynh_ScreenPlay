package starter.Page;

import net.serenitybdd.screenplay.targets.Target;

public class ProductPage {
    public static Target ProductName(String nameProduct){
        return Target.the("PRODUCT").locatedBy("//div[text()='" + nameProduct + "']");
    }
    public static Target ADD_TO_CART_BUTTON = Target.the("add to cart").locatedBy("//span[contains(text(),'Add to cart')]");
    public static Target ICON_CART = Target.the("go to cart").locatedBy("//a[@href='/cart']/div[contains(@class, 'align-items-center position-relative')]");
}
