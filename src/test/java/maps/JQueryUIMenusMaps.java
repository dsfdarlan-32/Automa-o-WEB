package maps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JQueryUIMenusMaps {
  WebDriver driver;
  
  public JQueryUIMenusMaps(WebDriver driver) {
    this.driver = driver;
  }
  
  public WebElement casoDeTeste() {
    return driver.findElement(By.xpath("//a[contains(text(),'JQuery UI Menus')]"));
  }
  
  public WebElement enabled() {
    return driver.findElement(By.xpath("//a[text()='Enabled']"));
  }
  
  public WebElement backToJQueryUI() {
    return driver.findElement(By.xpath("//a[.='Back to JQuery UI']"));
  }
}
