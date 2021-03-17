package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import driver.Driver;

public class BasePage {
  WebDriver driver = Driver.getDriver();
  
  public void click(By by) {
    driver.findElement(by).click();
  }
  
  public void sendKeys(By by, String text) {
    driver.findElement(by).sendKeys(text);
  }
  
  public Boolean isDisplayed(By by) {
    return driver.findElement(by).isDisplayed();
  }
  
  public void waitElement(By by, Integer n) {
    WebDriverWait wait = new WebDriverWait(driver, n);
    wait.until(ExpectedConditions.visibilityOfElementLocated(by));
  }
  
  public void clear(By by) {
    driver.findElement(by).clear();
  }
  
  public void moveToFrame(By by) {
    driver.switchTo().frame(driver.findElement(by));
  }
  
  public void refresh() {
    driver.navigate().refresh();
  }
  
  
}
