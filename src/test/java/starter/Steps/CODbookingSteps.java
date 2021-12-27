package starter.Steps;

import starter.Pages.CODbookingPages;

public class CODbookingSteps {
    CODbookingPages ProductPages;

    public void openCODloginPage() {
        ProductPages.clickCardsProducts();

    }

    public void setRentdate() {
        ProductPages.clickRentdate();
    }

    public void clickRentalbutton() {
        ProductPages.clickRentalcod();
    }

    public void clickKeranjang() {
        ProductPages.clickKeranjangTambah();
    }

    public void clickCartIcon() {
        ProductPages.clickcarticon();
    }

    public void clickcheckmarkBox() {
        ProductPages.clickchecmarkcod();
    }

    public void clickchecOutCOD() {
        ProductPages.clickcheckOUTCOD();
    }

    public void clickCODradiobutton() {
        ProductPages.clickCODrb();
    }

    public void clickbayarCOD() {
        ProductPages.clickbayarcod();
    }

    public void clickPopUpCOD() {
        ProductPages.clickpopupcod();
    }

    public void getCartEmpty() {
        ProductPages.getcartempty();
    }
}
