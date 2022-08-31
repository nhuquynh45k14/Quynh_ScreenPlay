package starter.Page;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

public class Perform {
    public static Performable closePopup() {
        return Task.where("{0} click close popup",
                Click.on(HomePage.ICON_CLOSE_POPUP));
    }

    public static Performable searchProduct(String searchTerm) {
        return Task.where("{0} searches for '" + searchTerm + "'",
                Enter.theValue(searchTerm)
                        .into(SearchPage.SEARCH_FIELD)
                        .thenHit(Keys.ENTER)
        );
    }

    public static Performable clickProduct(String product) {
        return Task.where("{0} click choose product",
                Click.on(ProductPage.ProductName(product))
        );
    }

    public static Performable addToCart() {
        return Task.where("Add product to cart",
                        Click.on(ProductPage.ADD_TO_CART_BUTTON))
                .then(Click.on(ProductPage.ICON_CART));
    }

public static Performable clickCheckout() {
    return Task.where("Click check out",
                    Click.on(CartPage.BUTTON_CHECK_OUT));
}

    public static Performable addShippingAddress(String email, String firstName, String lastName, String address, String apartment, String postalCode, String phone) {
        return Task.where("Input shipping address",
                Enter.theValue(email).into(ShippingAddressPage.TXT_EMAIL),
                Enter.theValue(firstName).into(ShippingAddressPage.TXT_FIRST_NAME),
                Enter.theValue(lastName).into(ShippingAddressPage.TXT_LAST_NAME),
                Enter.theValue(address).into(ShippingAddressPage.TXT_ADDRESS),
                Enter.theValue(apartment).into(ShippingAddressPage.TXT_APARTMENT),
                Enter.theValue(postalCode).into(ShippingAddressPage.TXT_POSTAL_CODE),
                Enter.theValue(phone).into(ShippingAddressPage.TXT_PHONE)
                        .thenHit(Keys.ENTER));
    }
}


