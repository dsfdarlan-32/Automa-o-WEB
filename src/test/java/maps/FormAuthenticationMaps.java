package maps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FormAuthenticationMaps {
  WebDriver driver;
  
  public FormAuthenticationMaps(WebDriver driver) {
    this.driver = driver;
  }
  
  public WebElement casoDeTeste() {
    return driver.findElement(By.xpath("//a[contains(text(),'Form Authentication')]"));
  }
  
  public WebElement userMame() {
    return driver.findElement(By.xpath("//input[@id='username']"));
  }
  
  public WebElement password() {
    return driver.findElement(By.xpath("//input[@id='password']"));
  }
  
  public WebElement login() {
    return driver.findElement(By.xpath("//button[@class='radius']"));
  }
  
  public WebElement alertaDeErro() {
    return driver.findElement(By.xpath("//*[@class='flash error']"));
  }
}
