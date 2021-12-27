package starter.Steps;

import starter.Pages.LogoutPages;

public class LogoutSteps {
    LogoutPages logOutPages;

    public void OpenLogoutPage() {
        logOutPages.clickiconRentz();
      }

     public void DropdownLogOut() {
        logOutPages.clickdropdownLogOut();
    }
}
