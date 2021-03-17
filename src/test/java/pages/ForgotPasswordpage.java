package pages;

import org.openqa.selenium.WebDriver;

import maps.ForgotPasswordMaps;

public class ForgotPasswordpage {
  private WebDriver driver;
  ForgotPasswordMaps forgotPasswordMaps;
  
  public ForgotPasswordpage(WebDriver driver) {
    this.driver = driver;
    forgotPasswordMaps = new ForgotPasswordMaps(driver);
  }
  
  public void clickCasoDeTeste() {
    forgotPasswordMaps.casoDeTeste().click();
    forgotPasswordMaps.email().click();
    forgotPasswordMaps.RetrievePassword().click();
  }
}
