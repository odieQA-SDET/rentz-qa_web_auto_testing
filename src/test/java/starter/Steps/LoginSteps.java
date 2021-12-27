package starter.Steps;

import starter.Pages.LoginPages;

public class LoginSteps {
  LoginPages loginPages;

  public void openHomePage() {
      loginPages.open();

  }
  public void openLoginPage() {
      loginPages.clickiconRentzID();
      loginPages.clickdropdownmasuk();
    }

    public void inputLoginInvalid() {
      loginPages.inputLoginInvalid();
    }
    public void inputInvalidEmail() {
    loginPages.inputInvalidEmail();
    }
    public void inputInvalidPassword() {
      loginPages.inputInvalidPassword();
    }


    public void inputLoginEmpty() {
      loginPages.inputLoginEmpty();
    }
    public void inputEmptyPassword() {
      loginPages.inputEmptyPassword();
    }
    public void inputEmptyEmail() {
      loginPages.inputEmptyEmail();
    }


    public void inputLoginSuccess() {
      loginPages.inputLoginSuccess();
    }


    public void ClickLogin() {
      loginPages.clickButtonMasuk();
  }
}
