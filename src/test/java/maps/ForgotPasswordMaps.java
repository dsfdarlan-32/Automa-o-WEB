package maps;

import org.openqa.selenium.By;

public class ForgotPasswordMaps {
  public By casoDeTeste = By.xpath("//a[contains(text(),'Forgot Password')]");
  public By email = By.xpath("//input[@id='email']");
  public By RetrievePassword = By.xpath("//i[text()='Retrieve password']");
}
