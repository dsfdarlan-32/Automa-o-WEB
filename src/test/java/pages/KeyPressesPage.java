package pages;

import java.awt.AWTException;
import java.awt.Robot;

import maps.KeyPressesMaps;

public class KeyPressesPage extends BasePage {
  KeyPressesMaps keyPressesMaps;
  
  public KeyPressesPage() {
    keyPressesMaps = new KeyPressesMaps();
  }
  
  public void clickCasoDeTeste() throws AWTException {
    click(keyPressesMaps.casoDeTeste);
    click(keyPressesMaps.Key);
    Robot robot = new Robot();
    robot.keyPress('z');
    isDisplayed(keyPressesMaps.youEntered);
  }
}
