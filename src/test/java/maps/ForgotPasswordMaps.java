package maps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ForgotPasswordMaps {
  WebDriver driver;
  
  public ForgotPasswordMaps(WebDriver driver) {
    this.driver = driver;
  }
  
  public WebElement casoDeTeste() {
    return driver.findElement(By.xpath("//a[contains(text(),'Forgot Password')]"));
  }
  
  public WebElement email() {
    return driver.findElement(By.xpath("//input[@id='email']"));
  }
  
  public WebElement RetrievePassword() {
    return driver.findElement(By.xpath("//i[text()='Retrieve password']"));
  }
}
