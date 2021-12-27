package starter.Test.TestLogin;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Steps.LoginSteps;

public class LoginEmpty {
    @Steps
    LoginSteps loginSteps;

    @When("I filled the empty email and Password")
    public void i_filled_the_empty_email_and_Password() {
        loginSteps.inputLoginEmpty();
    }

    @When("I clicked {string} button in page")
    public void i_clicked_button_in_page(String string) {
        loginSteps.ClickLogin();
    }

    @Then("Email tidak boleh kosong! Massage pop up")
    public void emailTidakBolehKosongMassagepopup() {

    }
}
