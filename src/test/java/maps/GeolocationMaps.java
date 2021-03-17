package maps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GeolocationMaps {
  WebDriver driver;
  
  public GeolocationMaps(WebDriver driver) {
    this.driver = driver;
  }
  
  public WebElement casoDeTeste() {
    return driver.findElement(By.xpath("//a[contains(text(),'Geolocation')]"));
  }
  
  public WebElement whereAmI() {
    return driver.findElement(By.xpath("//button[contains(text(),'Where am I?')]"));
  }
  
  public WebElement localizacao() {
    return driver.findElement(By.xpath("//p[@id='demo']"));
  }
}
