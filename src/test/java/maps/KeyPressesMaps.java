package maps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class KeyPressesMaps {
  WebDriver driver;
  
  public KeyPressesMaps(WebDriver driver) {
    this.driver = driver;
  }
  
  public WebElement casoDeTeste() {
    return driver.findElement(By.xpath("//a[contains(text(),'Key Presses')]"));
  }
  
  public WebElement youEntered() {
    return driver.findElement(By.xpath("//p[@id='result']"));
  }
  
  public WebElement Key() {
    return driver.findElement(By.xpath("//h3[contains(text(),'Key')]"));
  }
}
