package pages;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import maps.LargeAndDeepDOMMaps;

public class LargeAndDeepDOMPage {
  private WebDriver driver;
  LargeAndDeepDOMMaps largeAndDeepDOMMaps;
  
  public LargeAndDeepDOMPage(WebDriver driver) {
    this.driver = driver;
    largeAndDeepDOMMaps = new LargeAndDeepDOMMaps(driver);
  }
  
  public void clickCasoDeTeste() {
    largeAndDeepDOMMaps.casoDeTeste().click();
    // Locate element for which you wants to retrieve x y coordinates.
    Point classname = largeAndDeepDOMMaps.numero().getLocation();
    int xcordi = classname.getX();
    int ycordi = classname.getY();
    Actions builder1 = new Actions(driver);
    builder1.moveToElement(largeAndDeepDOMMaps.numero(), xcordi, xcordi).click().perform();
    largeAndDeepDOMMaps.numero().isDisplayed();
  }
}
