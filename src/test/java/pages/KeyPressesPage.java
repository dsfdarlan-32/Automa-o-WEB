package pages;

import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.WebDriver;

import maps.KeyPressesMaps;

public class KeyPressesPage {
  private WebDriver driver;
  KeyPressesMaps keyPressesMaps;
  
  public KeyPressesPage(WebDriver driver) {
    this.driver = driver;
    keyPressesMaps = new KeyPressesMaps(driver);
  }
  
  public void clickCasoDeTeste() throws AWTException {
    keyPressesMaps.casoDeTeste().click();
    keyPressesMaps.Key().click();
    Robot robot = new Robot();
    robot.keyPress('d');
    keyPressesMaps.youEntered().isDisplayed();
  }
}
