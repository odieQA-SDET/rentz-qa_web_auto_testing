package starter.Test.TestLogin;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Steps.LoginSteps;

public class LoginInvalidPassword {
    @Steps
    LoginSteps loginSteps;

    @When("I filled my email correctly and invalid Password")
    public void i_filled_my_email_correctly_and_invalid_Password() {
        loginSteps.inputInvalidPassword();
    }

    @When("I clicked {string} button in page system")
    public void i_clicked_button_in_page_system(String string) {
        loginSteps.ClickLogin();
    }

    @Then("Email\\/Kata sandi salah! Massage pop up")
    public void emailKataSandiSalahMassagePopUp() {

    }
}
