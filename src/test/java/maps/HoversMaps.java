package maps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HoversMaps {
  WebDriver driver;
  
  public HoversMaps(WebDriver driver) {
    this.driver = driver;
  }
  
  public WebElement casoDeTeste() {
    return driver.findElement(By.xpath("//a[contains(text(),'Hovers')]"));
  }
  
  public WebElement serAvatar1() {
    return driver.findElement(By.xpath("(//img[@alt='User Avatar'])[1]"));
  }
  
  public WebElement viewProfile() {
    return driver.findElement(By.xpath("(//a[contains(text(),'View profile')])[1]"));
  }
}
