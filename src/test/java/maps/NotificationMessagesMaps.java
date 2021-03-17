package maps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NotificationMessagesMaps {
  WebDriver driver;
  
  public NotificationMessagesMaps(WebDriver driver) {
    this.driver = driver;
  }
  
  public WebElement casoDeTeste() {
    return driver.findElement(By.xpath("//a[contains(text(),'Notification Messages')]"));
  }
  
  public WebElement clickhere() {
    return driver.findElement(By.xpath("//a[text()='Click here']"));
  }
  
  public WebElement flashNotice() {
    return driver.findElement(By.xpath("//*[@class='flash notice']"));
  }
}
