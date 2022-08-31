package starter.Page;

import net.serenitybdd.screenplay.targets.Target;

public class ShippingAddressPage {
    public static Target TXT_EMAIL = Target.the("email").locatedBy("//input[@id='checkout_email']");
    public static Target TXT_FIRST_NAME = Target.the("first name").locatedBy("//input[@id='checkout_shipping_address_first_name']");
    public static Target TXT_LAST_NAME = Target.the("last name").locatedBy("//input[@id='checkout_shipping_address_last_name']");
    public static Target TXT_ADDRESS = Target.the("address").locatedBy("//input[@id='checkout_shipping_address_address1']");
    public static Target TXT_APARTMENT = Target.the("apartment").locatedBy("//input[@id='checkout_shipping_address_address2']");
    public static Target TXT_POSTAL_CODE = Target.the("postal code").locatedBy("//input[@id='checkout_shipping_address_zip']");
    public static Target TXT_PHONE = Target.the("phone").locatedBy("//input[@id='checkout_shipping_address_phone']");

}
