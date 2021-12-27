package starter.Test.TestPayment;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Steps.CODbookingSteps;
import starter.Steps.LoginSteps;

public class CODbookingSuccess {
    @Steps
    CODbookingSteps codSteps;

    @When("I have selected and clicked the product that I need")
    public void i_have_selected_and_clicked_the_product_that_I_need() {
        // Write code here that turns the phrase above into concrete actions
        codSteps.openCODloginPage();
    }

    @When("I went to detail product page")
    public void i_went_to_detail_product_page() {
        // Write code here that turns the phrase above into concrete actions

    }

    @When("I have set the rental date")
    public void i_have_set_the_rental_date() {
        // Write code here that turns the phrase above into concrete actions
        codSteps.setRentdate();
    }

    @When("I clicked {string} button in detail page of product")
    public void i_clicked_button_in_detail_page_of_product(String string) {
        // Write code here that turns the phrase above into concrete actions
        codSteps.clickRentalbutton();

    }

    @When("I Clicked {string} button on pop up box of Tambahkan ke keranjang")
    public void i_Clicked_button_on_pop_up_box_of_Tambahkan_ke_keranjang(String string) {
        // Write code here that turns the phrase above into concrete actions
        codSteps.clickKeranjang();
    }

    @When("I got the pop up masage success and been going to keranjang page")
    public void i_got_the_pop_up_masage_success_and_been_going_to_keranjang_page() {
        // Write code here that turns the phrase above into concrete actions

    }

    @And("I Clicked icon {string} button Icon")
    public void iClickedIconCartButtonIcon() {
        codSteps.clickCartIcon();
    }

    @When("I clicked checkmark box and {string} button")
    public void i_clicked_checkmark_box_and_button(String string) {
        // Write code here that turns the phrase above into concrete actions
        codSteps.clickcheckmarkBox();
        codSteps.clickchecOutCOD();
    }

    @When("I got Informasi Pembayaran and clicked {string} radio button")
    public void i_got_Informasi_Pembayaran_and_clicked_radio_button(String string) {
        // Write code here that turns the phrase above into concrete actions
        codSteps.clickCODradiobutton();

    }

    @When("I clicked {string} button in checkout page")
    public void i_clicked_button_in_checkout_page(String string) {
        // Write code here that turns the phrase above into concrete actions
       codSteps.clickbayarCOD();
    }

    @Then("I got the pop up masage of COD and clicked {string} and Keranjang saya was Empty")
    public void i_got_the_pop_up_masage_of_COD_and_clicked_and_Keranjang_saya_was_Empty(String string) {
        // Write code here that turns the phrase above into concrete actions
       codSteps.clickPopUpCOD();
       codSteps.getCartEmpty();
    }


}