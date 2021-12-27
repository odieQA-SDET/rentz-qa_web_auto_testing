package starter.Pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPages extends PageObject {
    @FindBy(id = "logo-user-notlogin")
    WebElement iconRentzID;
    public void clickiconRentzID() {
        iconRentzID.click();
    }

    @FindBy(id="masuk")
    WebElement dropdownmasuk;
    public void clickdropdownmasuk() {
        dropdownmasuk.click();
   }

    @FindBy(id="btn-masuk")
    WebElement buttonMasuk;
    public void clickButtonMasuk() {
        buttonMasuk.click();
    }

    @FindBy(id = "email")
    WebElement inputEmail;

    @FindBy(id = "password")
    WebElement inputPass;


    public void inputLoginInvalid() {
        inputEmail.sendKeys("admin1003@gmail.com");
        inputPass.sendKeys("admin1003");
    }
    public void inputInvalidEmail() {
        inputEmail.sendKeys("admin55@gmail.com");
        inputPass.sendKeys("admin103");
    }
    public void inputInvalidPassword() {
        inputEmail.sendKeys("admin103@gmail.com");
        inputPass.sendKeys("admin113");
    }

    public void inputLoginEmpty() {
        inputEmail.sendKeys("");
        inputPass.sendKeys("");
    }
    public void inputEmptyPassword() {
        inputEmail.sendKeys("admin103@gmail.com");
        inputPass.sendKeys("");
    }
    public void inputEmptyEmail() {
        inputEmail.sendKeys("");
        inputPass.sendKeys("admin103");
    }

    public void inputLoginSuccess() {
        inputEmail.sendKeys("admin103@gmail.com");
        inputPass.sendKeys("admin103");
    }

}
