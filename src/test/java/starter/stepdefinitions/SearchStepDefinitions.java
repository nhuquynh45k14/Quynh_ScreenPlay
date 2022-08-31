package starter.stepdefinitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.ensure.Ensure;
import starter.Data.Product;
import starter.Data.ShippingAddress;
import starter.Page.CartPage;
import starter.Page.CheckOutShippingAddressPage;
import starter.Page.Perform;
import starter.navigation.NavigateTo;

import static starter.Data.Product.product;

public class SearchStepDefinitions {

    @Given("{actor} open HomePage")
    public void openHomePage(Actor actor) {
        actor.wasAbleTo(NavigateTo.thePerromartHomePage());
        actor.wasAbleTo(Perform.closePopup());
    }

    @When("{actor} looks up")
    public void searchesFor(Actor actor) {
        actor.attemptsTo(
                Perform.searchProduct(Product.searchTerm)
        );
    }

    @When("{actor} click chosen product")
    public void clickChosenProduct(Actor actor) {
        actor.attemptsTo(
                Perform.clickProduct(product)
        );
    }

    @When("{actor} add to Cart")
    public void addToCart(Actor actor) {
        actor.attemptsTo(Perform.addToCart());
    }

    @When("{actor} verify product {string}")
    public void iVerifyProduct(Actor actor, String productName) {
        actor.attemptsTo(Ensure.that(CartPage.nameProduct(productName)).hasText(productName));
    }

    @When("{actor} click check out")
    public void clickCheckOut(Actor actor) {
        actor.attemptsTo(Perform.clickCheckout());
    }

    @When("{actor} add shipping address")
    public void addShippingAddress(Actor actor) {
        actor.attemptsTo(Perform.addShippingAddress(ShippingAddress.email, ShippingAddress.firstName, ShippingAddress.lastName,
                ShippingAddress.address, ShippingAddress.apartment, ShippingAddress.postalCode, ShippingAddress.phone));
    }

    @When("{actor} verify Shipping Address")
    public void iVerifyShippingAddress(Actor actor) {
        actor.has(Ensure.that(CheckOutShippingAddressPage.CONTACT).hasText(ShippingAddress.email));
        actor.has(Ensure.that(CheckOutShippingAddressPage.SHIP_TO).hasText(ShippingAddress.address + ", " + ShippingAddress.apartment + ", Singapore " + ShippingAddress.postalCode));
    }
}
