package starter.Test.TestLogin;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Steps.LoginSteps;

public class LoginEmptyEmail {
    @Steps
    LoginSteps loginSteps;

    @When("I filled the empty email and password correctly")
    public void i_filled_the_empty_email_and_password_correctly() {
        loginSteps.inputEmptyEmail();
    }

    @When("I clicked {string} button in web")
    public void i_clicked_button_web(String string) {
        loginSteps.ClickLogin();
    }

}
