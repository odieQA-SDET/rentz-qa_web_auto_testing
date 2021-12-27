package starter.Test.TestLogin;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Steps.LoginSteps;

public class LoginSuccess {
    @Steps
    LoginSteps loginSteps;
    @Given("I was on the Login page")
    public void i_was_on_the_Login_page() {

        loginSteps.openHomePage();
        loginSteps.openLoginPage();
    }

    @When("I filled my email and Password correctly")
    public void i_filled_my_email_and_Password_correctly() {

        loginSteps.inputLoginSuccess();
    }

    @When("I clicked {string} button")
    public void i_clicked_button(String string) {

        loginSteps.ClickLogin();
    }

    @Then("Anda telah login! Massage Pop up")
    public void andaTelahLoginMassagePopUp() {

    }
}
