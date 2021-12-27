package starter.Test.TestLogOut;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Steps.LogoutSteps;

public class LogoutSuccess {
    @Steps
    LogoutSteps logOut;
    @When("I Clicked icon {string} button")
    public void iClickedIconAButton(String string) {
        logOut.OpenLogoutPage();

    }

    @And("I clicked {string} button in menu dropp down of icon A")
    public void i_clicked_button_in_menu_droppdown_oficon_A(String string){
        logOut.DropdownLogOut();
    }

    @Then("Anda berhasil keluar! Massage Pop up")
    public void andaBerhasilKeluarMassagePopUp() {
    }
}
