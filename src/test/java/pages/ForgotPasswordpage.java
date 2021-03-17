package pages;

import maps.ForgotPasswordMaps;

public class ForgotPasswordpage extends BasePage{
  ForgotPasswordMaps forgotPasswordMaps;
  
  public ForgotPasswordpage() {
    forgotPasswordMaps = new ForgotPasswordMaps();
  }
  
  public void clickCasoDeTeste() {
    click(forgotPasswordMaps.casoDeTeste);
    click(forgotPasswordMaps.email);
    click(forgotPasswordMaps.RetrievePassword);
  }
}
