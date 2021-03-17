package maps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MultipleWindowsMaps {
  WebDriver driver;
  
  public MultipleWindowsMaps(WebDriver driver) {
    this.driver = driver;
  }
  
  public WebElement casoDeTeste() {
    return driver.findElement(By.xpath("//a[contains(text(),'Multiple Windows')]"));
  }
  
  public WebElement clickHere() {
    return driver.findElement(By.xpath("//a[text()='Click Here']"));
  }
  
  public WebElement newWindow() {
    return driver.findElement(By.xpath("//a[text()='Click Here']"));
  }
}
