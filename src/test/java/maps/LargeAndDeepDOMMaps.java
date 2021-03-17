package maps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LargeAndDeepDOMMaps {
  WebDriver driver;
  
  public LargeAndDeepDOMMaps(WebDriver driver) {
    this.driver = driver;
  }
  
  public WebElement casoDeTeste() {
    return driver.findElement(By.xpath("//a[contains(text(),'Large & Deep DOM')]"));
  }
  
  public WebElement numero() {
    return driver.findElement(By.xpath("//*[text()='1.13']"));
  }
}
