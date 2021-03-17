package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

import maps.JavaScriptAlertsMaps;

public class JavaScriptAlertsPage {
  private WebDriver driver;
  JavaScriptAlertsMaps javaScriptAlertsMaps;
  
  public JavaScriptAlertsPage(WebDriver driver) {
    this.driver = driver;
    javaScriptAlertsMaps = new JavaScriptAlertsMaps(driver);
  }
  
  public void clickCasoDeTeste() throws InterruptedException {
    javaScriptAlertsMaps.casoDeTeste().click();
    javaScriptAlertsMaps.clickForJSAlert().click();
    Alert alert = driver.switchTo().alert();
    alert.accept();
    javaScriptAlertsMaps.jsAlert().click();
    alert.sendKeys("teste");
    alert.accept();
  }
}
