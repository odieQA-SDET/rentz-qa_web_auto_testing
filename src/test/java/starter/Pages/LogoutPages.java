package starter.Pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogoutPages extends PageObject {

    @FindBy(id="logo-user-login")
    WebElement iconRentz;
    public void  clickiconRentz() {
        iconRentz.click();}

    @FindBy(id="logout")
    WebElement clickIconLogOut;
    public void clickdropdownLogOut() {
        clickIconLogOut.click();
    }

}
