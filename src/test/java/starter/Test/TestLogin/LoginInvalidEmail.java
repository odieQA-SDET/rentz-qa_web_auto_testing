package starter.Test.TestLogin;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Steps.LoginSteps;

public class LoginInvalidEmail {
    @Steps
    LoginSteps loginSteps;

    @When("I filled my invalid email and Password correctly")
    public void i_filled_my_email_and_Password_correctly() {
        loginSteps.inputInvalidEmail();
    }

    @When("I clicked {string} button in login page")
    public void i_clicked_button_in_login_page(String string) {
        loginSteps.ClickLogin();
    }

    @Then("Email atau Kata sandi salah! Massage pop up")
    public void emailatauKataSandiSalahMassagePopUp() {
    }

}
