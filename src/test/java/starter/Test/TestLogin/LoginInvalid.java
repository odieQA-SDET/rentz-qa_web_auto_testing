package starter.Test.TestLogin;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Steps.LoginSteps;

public class LoginInvalid {
    @Steps
    LoginSteps loginSteps;

    @When("I filled the invalid email and Password")
    public void i_filled_the_invalid_email_and_Password() {
        loginSteps.inputLoginInvalid();
    }

    @When("I clicked {string} button web")
    public void i_clicked_button_web(String string) {
        loginSteps.ClickLogin();
    }

}
