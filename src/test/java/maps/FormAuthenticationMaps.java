package maps;

import org.openqa.selenium.By;

public class FormAuthenticationMaps {
  public By casoDeTeste = By.xpath("//a[contains(text(),'Form Authentication')]");
  public By userMame = By.xpath("//input[@id='username']");
  public By password = By.xpath("//input[@id='password']");
  public By login = By.xpath("//button[@class='radius']");
  public By alertaDeErro = By.xpath("//*[@class='flash error']");
}
