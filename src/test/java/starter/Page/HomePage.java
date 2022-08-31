package starter.Page;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class HomePage extends PageObject {
    static Target ICON_CLOSE_POPUP = Target.the("close popup").locatedBy("//button[@tabindex='0']");
}
