package maps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FloatingMenuMaps {
  WebDriver driver;
  
  public FloatingMenuMaps(WebDriver driver) {
    this.driver = driver;
  }
  
  public WebElement casoDeTeste() {
    return driver.findElement(By.xpath("//a[contains(text(),'Floating Menu')]"));
  }
  
  public WebElement Menu(String text) {
    return driver.findElement(By.xpath("//*[text()='" + text + "']"));
  }
}
