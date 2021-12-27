package starter.Pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CODbookingPages extends PageObject {
    @FindBy(id="KAMERA0")
    WebElement clickProducts;
    public void clickCardsProducts() {
        clickProducts.click();
    }

    @FindBy(id="mui-4")
    WebElement clickDate;
    public void clickRentdate() {
        clickDate.click();
    }
    //button[@class='MuiButtonBase-root MuiPickersDay-root Mui-selected MuiDateRangePickerDay-day css-iwfapa'][contains(text(),'28')]
    @FindBy(xpath ="//input[@id='mui-4']")
    WebElement inputStartdate;
    //button[@class='MuiButtonBase-root MuiPickersDay-root MuiDateRangePickerDay-day MuiDateRangePickerDay-notSelectedDate MuiDateRangePickerDay-dayOutsideRangeInterval css-8k3ddu'][contains(text(),'5')]
    @FindBy(xpath ="//input[@id='mui-5']")
    WebElement inputFinishdate;

    public void inputRentDate() {
        inputStartdate.sendKeys("28");
        inputFinishdate.sendKeys("5");
    }

    @FindBy(id="rent-cartNull")
    WebElement clickRentalCOD;
    public void clickRentalcod() {
        clickRentalCOD.click();
    }

 //   @FindBy(className="modal-content")
    @FindBy(id="add-cart")
    WebElement clickkeranjang;
    public void clickKeranjangTambah() {
        clickkeranjang.click();
    }

    @FindBy(className="navbar-cart") //div[@class='navbar-cart']//p//*[local-name()='svg']
    WebElement clickCartCOD;
    public void clickcarticon() {
        clickCartCOD.click();
    }

    @FindBy(className="checkmark")
    WebElement clickcheckCOD;
    public void clickchecmarkcod() {
        clickcheckCOD.click();
    }
    @FindBy(className="btn-checkout")
    WebElement clickcheckoutCOD;
    public void clickcheckOUTCOD() {
        clickcheckoutCOD.click();
    }

    @FindBy(id="cod")
    WebElement clickCODRB;
    public void clickCODrb() {
        clickCODRB.click();
    }

    @FindBy(className="form-control mb-1 btn btn-success")
    WebElement clickBayarCOD;
    public void clickbayarcod() {
        clickBayarCOD.click();
    }

    @FindBy(className="swal2-confirm swal2-styled")
    WebElement clickPoPCOD;
    public void clickpopupcod() {
        clickPoPCOD.click();
    }

    @FindBy(xpath="//p[contains(text(),'Keranjang Kosong')]")
    WebElement GETcartEmpty;
    public void getcartempty() {
        GETcartEmpty.getText();
    }
}
