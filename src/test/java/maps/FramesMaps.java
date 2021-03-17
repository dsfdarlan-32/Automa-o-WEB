package maps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FramesMaps {
  WebDriver driver;
  
  public FramesMaps(WebDriver driver) {
    this.driver = driver;
  }
  
  public WebElement casoDeTeste() {
    return driver.findElement(By.xpath("//a[contains(text(),'Frames')]"));
  }
  
  public WebElement iFrame() {
    return driver.findElement(By.xpath("//a[text()='iFrame']"));
  }
  
  public WebDriver frame() {
    return driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='mce_0_ifr']")));
  }
  
  public WebElement caixaTexto() {
    return driver.findElement(By.xpath("//body[@id='tinymce']"));
  }
}
