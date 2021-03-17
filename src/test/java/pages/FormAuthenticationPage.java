package pages;

import maps.FormAuthenticationMaps;

public class FormAuthenticationPage extends BasePage {
  FormAuthenticationMaps formAuthenticationMaps;
  
  public FormAuthenticationPage() {
    formAuthenticationMaps = new FormAuthenticationMaps();
  }
  
  public void clickCasoDeTeste() {
    click(formAuthenticationMaps.casoDeTeste);
    sendKeys(formAuthenticationMaps.userMame, "tomsmith");
    sendKeys(formAuthenticationMaps.password, "SuperSecretPassword");
    click(formAuthenticationMaps.login);
    isDisplayed(formAuthenticationMaps.alertaDeErro);
  }
}
