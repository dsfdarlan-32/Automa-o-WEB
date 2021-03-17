package maps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavaScriptAlertsMaps {
  WebDriver driver;
  
  public JavaScriptAlertsMaps(WebDriver driver) {
    this.driver = driver;
  }
  
  public WebElement casoDeTeste() {
    return driver.findElement(By.xpath("//a[contains(text(),'JavaScript Alerts')]"));
  }
  
  public WebElement clickForJSAlert() {
    return driver.findElement(By.xpath("//button[contains(@onclick,'jsAlert()')]"));
  }
  
  public WebElement jsAlert() {
    return driver.findElement(By.xpath("//button[contains(@onclick,'jsPrompt()')]"));
  }
}
