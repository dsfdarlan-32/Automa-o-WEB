package pages;

import org.openqa.selenium.WebDriver;

import maps.FormAuthenticationMaps;

public class FormAuthenticationPage {
  private WebDriver driver;
  FormAuthenticationMaps formAuthenticationMaps;
  
  public FormAuthenticationPage(WebDriver driver) {
    this.driver = driver;
    formAuthenticationMaps = new FormAuthenticationMaps(driver);
  }
  
  public void clickCasoDeTeste() {
    formAuthenticationMaps.casoDeTeste().click();
    formAuthenticationMaps.userMame().sendKeys("tomsmith");
    formAuthenticationMaps.password().sendKeys("SuperSecretPassword");
    formAuthenticationMaps.login().click();
    formAuthenticationMaps.alertaDeErro().isDisplayed();
  }
}
